package med.voll.api.mappings;

import javax.annotation.processing.Generated;
import med.voll.api.endereco.dto.EnderecoDto;
import med.voll.api.medico.Medico;
import med.voll.api.medico.dto.Especialidade;
import med.voll.api.medico.dto.MedicoVisualizarDto;
import med.voll.api.medico.dto.MedicosDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-27T16:40:48-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class MedicoMapperImpl implements MedicoMapper {

    @Autowired
    private EnderecoMapper enderecoMapper;

    @Override
    public Medico toEntity(MedicosDTO medicosDTO) {
        if ( medicosDTO == null ) {
            return null;
        }

        Medico medico = new Medico();

        return medico;
    }

    @Override
    public MedicosDTO toDto(Medico medico) {
        if ( medico == null ) {
            return null;
        }

        String nome = null;
        String email = null;
        String telefone = null;
        String crm = null;
        Especialidade especialidade = null;
        EnderecoDto endereco = null;

        nome = medico.getNome();
        email = medico.getEmail();
        telefone = medico.getTelefone();
        crm = medico.getCrm();
        especialidade = medico.getEspecialidade();
        endereco = enderecoMapper.toDto( medico.getEndereco() );

        MedicosDTO medicosDTO = new MedicosDTO( nome, email, telefone, crm, especialidade, endereco );

        return medicosDTO;
    }

    @Override
    public Medico partialUpdate(MedicosDTO medicosDTO, Medico medico) {
        if ( medicosDTO == null ) {
            return medico;
        }

        return medico;
    }

    @Override
    public Medico toEntity(MedicoVisualizarDto medicoVisualizarDto) {
        if ( medicoVisualizarDto == null ) {
            return null;
        }

        Medico medico = new Medico();

        return medico;
    }

    @Override
    public MedicoVisualizarDto toDto1(Medico medico) {
        if ( medico == null ) {
            return null;
        }

        Long id = null;
        String nome = null;

        id = medico.getId();
        nome = medico.getNome();

        MedicoVisualizarDto medicoVisualizarDto = new MedicoVisualizarDto( id, nome );

        return medicoVisualizarDto;
    }

    @Override
    public Medico partialUpdate(MedicoVisualizarDto medicoVisualizarDto, Medico medico) {
        if ( medicoVisualizarDto == null ) {
            return medico;
        }

        return medico;
    }
}
