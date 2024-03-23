package med.voll.api.mappings;

import javax.annotation.processing.Generated;
import med.voll.api.endereco.Endereco;
import med.voll.api.endereco.dto.EnderecoDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-27T16:23:13-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class EnderecoMapperImpl implements EnderecoMapper {

    @Override
    public Endereco toEntity(EnderecoDto enderecoDto) {
        if ( enderecoDto == null ) {
            return null;
        }

        Endereco endereco = new Endereco();

        return endereco;
    }

    @Override
    public EnderecoDto toDto(Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        String logradouro = null;
        String bairro = null;
        String cep = null;
        String cidade = null;
        String uf = null;
        String numero = null;
        String complemento = null;

        logradouro = endereco.getLogradouro();
        bairro = endereco.getBairro();
        cep = endereco.getCep();
        cidade = endereco.getCidade();
        uf = endereco.getUf();
        numero = endereco.getNumero();
        complemento = endereco.getComplemento();

        EnderecoDto enderecoDto = new EnderecoDto( logradouro, bairro, cep, cidade, uf, numero, complemento );

        return enderecoDto;
    }
}
