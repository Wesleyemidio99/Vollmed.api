package med.voll.api.paciente.dto;

import lombok.Value;

import java.io.Serializable;

@Value
public class PacienteVisualizarDto implements Serializable {

    Long id;
    String nome;
    String email;
    String cpf;

}
