package med.voll.api.medico.dto;

import lombok.Value;
import med.voll.api.medico.Medico;

import java.io.Serializable;

/**
 * DTO for {@link Medico}
 */
@Value
public class MedicoVisualizarDto implements Serializable {
    Long id;
    String nome;
}