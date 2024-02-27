package med.voll.api.endereco.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class DadosEndereco {

    @NotBlank
    private final String logradouro;

    @NotBlank
    private final String bairro;

    @NotBlank
    @Pattern(regexp = "\\d{8}")
    private final String cep;

    @NotBlank
    private final  String cidade;

    @NotBlank
    private final String uf;
    private final String numero;
    private final String complemento;
}
