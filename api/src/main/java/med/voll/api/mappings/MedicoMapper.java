package med.voll.api.mappings;

import med.voll.api.medico.Medico;
import med.voll.api.medico.dto.MedicoVisualizarDto;
import med.voll.api.medico.dto.MedicosDTO;
import org.mapstruct.*;

@Mapper(uses = {EnderecoMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface MedicoMapper {
    Medico toEntity(MedicosDTO medicosDTO);

    MedicosDTO toDto(Medico medico);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Medico partialUpdate(MedicosDTO medicosDTO, @MappingTarget Medico medico);

    Medico toEntity(MedicoVisualizarDto medicoVisualizarDto);

    MedicoVisualizarDto toDto1(Medico medico);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Medico partialUpdate(MedicoVisualizarDto medicoVisualizarDto, @MappingTarget Medico medico);
}