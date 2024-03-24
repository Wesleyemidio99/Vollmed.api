package med.voll.api.services;

import lombok.RequiredArgsConstructor;
import med.voll.api.mappings.PacienteMapper;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.dto.PacienteDto;
import med.voll.api.paciente.dto.PacienteVisualizarDto;
import med.voll.api.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Service
@Validated
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteRepository repository;
    private final PacienteMapper mapper;

    @Transactional(rollbackFor = Exception.class)
    public void cadastrar(PacienteDto cadastroPaciente){
        repository.save(mapper.toEntity(cadastroPaciente));
    }

    public List<PacienteVisualizarDto> listarPaciente(){
        List<Paciente> pacienteList = repository.findAll();
        List<PacienteVisualizarDto> pacienteVisualizarDtoList = new ArrayList<>();
        for (Paciente paciente:
             pacienteList) {
            pacienteVisualizarDtoList.add(mapper.toDto1(paciente));
        }
        return pacienteVisualizarDtoList;
    }
}
