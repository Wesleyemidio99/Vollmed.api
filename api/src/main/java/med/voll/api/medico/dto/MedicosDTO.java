package med.voll.api.medico.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import med.voll.api.endereco.dto.DadosEndereco;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class MedicosDTO {

    @NotBlank
    private final String nome;

    @Email
    @NotBlank
    private final String email;

    @NotBlank
    private final String telefone;

    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    private final String crm;

    @NotNull
    private final Especialidade especialidade;

    @Valid
    @NotNull
    private final DadosEndereco endereco;

}
