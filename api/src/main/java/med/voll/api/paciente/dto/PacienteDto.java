package med.voll.api.paciente.dto;

import med.voll.api.endereco.dto.DadosEndereco;

public record PacienteDto(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {

}
