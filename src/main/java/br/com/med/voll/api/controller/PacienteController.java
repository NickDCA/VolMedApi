package br.com.med.voll.api.controller;


import br.com.med.voll.api.paciente.DadosCadastroPaciente;
import br.com.med.voll.api.paciente.DadosListagemPaciente;
import br.com.med.voll.api.paciente.Paciente;
import br.com.med.voll.api.paciente.PacienteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
    @Autowired
    PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable page) {
        return repository.findAll(page).map(DadosListagemPaciente::new);
    }
}
