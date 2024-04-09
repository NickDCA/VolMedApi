package br.com.med.voll.api.dto;


import br.com.med.voll.api.endereco.DadosEndereco;
import br.com.med.voll.api.medico.Especialidade;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
