package med.voll.api.mappings;

import javax.annotation.processing.Generated;
import med.voll.api.endereco.dto.EnderecoDto;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.dto.PacienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-27T16:23:13-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class PacienteMapperImpl implements PacienteMapper {

    @Autowired
    private EnderecoMapper enderecoMapper;

    @Override
    public Paciente toEntity(PacienteDto pacienteDto) {
        if ( pacienteDto == null ) {
            return null;
        }

        Paciente paciente = new Paciente();

        paciente.setNome( pacienteDto.getNome() );
        paciente.setEmail( pacienteDto.getEmail() );
        paciente.setCpf( pacienteDto.getCpf() );
        paciente.setTelefone( pacienteDto.getTelefone() );
        paciente.setEndereco( enderecoMapper.toEntity( pacienteDto.getEndereco() ) );

        return paciente;
    }

    @Override
    public PacienteDto toDto(Paciente paciente) {
        if ( paciente == null ) {
            return null;
        }

        String nome = null;
        String email = null;
        String telefone = null;
        String cpf = null;
        EnderecoDto endereco = null;

        nome = paciente.getNome();
        email = paciente.getEmail();
        telefone = paciente.getTelefone();
        cpf = paciente.getCpf();
        endereco = enderecoMapper.toDto( paciente.getEndereco() );

        PacienteDto pacienteDto = new PacienteDto( nome, email, telefone, cpf, endereco );

        return pacienteDto;
    }

    @Override
    public Paciente partialUpdate(PacienteDto pacienteDto, Paciente paciente) {
        if ( pacienteDto == null ) {
            return paciente;
        }

        if ( pacienteDto.getNome() != null ) {
            paciente.setNome( pacienteDto.getNome() );
        }
        if ( pacienteDto.getEmail() != null ) {
            paciente.setEmail( pacienteDto.getEmail() );
        }
        if ( pacienteDto.getCpf() != null ) {
            paciente.setCpf( pacienteDto.getCpf() );
        }
        if ( pacienteDto.getTelefone() != null ) {
            paciente.setTelefone( pacienteDto.getTelefone() );
        }
        if ( pacienteDto.getEndereco() != null ) {
            paciente.setEndereco( enderecoMapper.toEntity( pacienteDto.getEndereco() ) );
        }

        return paciente;
    }
}
