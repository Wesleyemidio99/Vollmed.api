package med.voll.api.services;

import lombok.RequiredArgsConstructor;
import med.voll.api.mappings.MedicoMapper;
import med.voll.api.medico.MedicosRepository;
import med.voll.api.medico.dto.DadosCadastroMedico;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
@RequiredArgsConstructor
public class MedicosService {

    private final MedicosRepository repository;
    private final MedicoMapper medicoMapper;

    public void cadastrar(DadosCadastroMedico cadastroMedico){
        repository.save(medicoMapper.toEntity(cadastroMedico));
    }
}
