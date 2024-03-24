package med.voll.api.medico.dto;

import lombok.Value;

import java.io.Serializable;

@Value
public class MedicoVisualizarDto implements Serializable {
    Long id;
    String nome;
    String email;
    String crm;
    Especialidade especialidade;

}