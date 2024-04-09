package br.com.med.voll.api.paciente;

import br.com.med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String cpf, String telefone, DadosEndereco endereco) {
}
