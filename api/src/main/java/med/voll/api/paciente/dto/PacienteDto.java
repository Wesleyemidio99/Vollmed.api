package med.voll.api.paciente.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import med.voll.api.endereco.dto.DadosEndereco;


@Getter
@Setter
@RequiredArgsConstructor
public class PacienteDto {

    @NotBlank
    private final String nome;

    @NotBlank
    @Email
    private final String email;

    @NotBlank
    private final String telefone;

    @NotBlank
    private final String cpf;

    @Valid
    @NotNull
    private final DadosEndereco endereco;

}
