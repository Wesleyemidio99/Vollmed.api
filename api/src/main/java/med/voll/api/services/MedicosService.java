package med.voll.api.services;

import lombok.RequiredArgsConstructor;
import med.voll.api.mappings.MedicoMapper;
import med.voll.api.medico.Medico;
import med.voll.api.medico.dto.MedicoVisualizarDto;
import med.voll.api.repository.MedicosRepository;
import med.voll.api.medico.dto.MedicosDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Validated
@RequiredArgsConstructor
public class MedicosService {

    private final MedicosRepository repository;
    private final MedicoMapper mapper;

    @Transactional(rollbackFor = Exception.class)
    public void cadastrar(MedicosDTO cadastroMedico){
        repository.save(mapper.toEntity(cadastroMedico));
    }

    public List <MedicoVisualizarDto> listarMedicos(){
        List <Medico> medicosList = repository.findAll();
        return medicosList.stream().map(mapper::toDto1).collect(Collectors.toList());
    }
}
