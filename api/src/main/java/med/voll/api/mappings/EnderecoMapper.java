package med.voll.api.mappings;

import med.voll.api.endereco.Endereco;
import med.voll.api.endereco.dto.EnderecoDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EnderecoMapper {
    Endereco toEntity(EnderecoDto enderecoDto);

    EnderecoDto toDto(Endereco endereco);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Endereco partialUpdate(EnderecoDto enderecoDto, @MappingTarget Endereco endereco);
}