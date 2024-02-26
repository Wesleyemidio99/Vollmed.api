package med.voll.api.mappings;

import med.voll.api.medico.Medico;
import med.voll.api.medico.dto.DadosCadastroMedico;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface MedicoMapper {
    Medico toEntity(DadosCadastroMedico dadosCadastroMedico);

    DadosCadastroMedico toDto(Medico medico);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Medico partialUpdate(DadosCadastroMedico dadosCadastroMedico, @MappingTarget Medico medico);
}