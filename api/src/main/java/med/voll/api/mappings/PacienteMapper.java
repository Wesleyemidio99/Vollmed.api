package med.voll.api.mappings;

import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.dto.PacienteDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PacienteMapper {
    Paciente toEntity(PacienteDto pacienteDto);

    PacienteDto toDto(Paciente paciente);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Paciente partialUpdate(PacienteDto pacienteDto, @MappingTarget Paciente paciente);
}