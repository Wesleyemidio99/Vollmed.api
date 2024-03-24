package med.voll.api.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import med.voll.api.paciente.dto.PacienteDto;
import med.voll.api.paciente.dto.PacienteVisualizarDto;
import med.voll.api.services.PacienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("paciente")
@RequiredArgsConstructor
public class PacienteController {

    private final PacienteService service;
    @PostMapping
    public void cadastrar(@RequestBody @Valid PacienteDto dados){
        service.cadastrar(dados);
    }

    @GetMapping
    public List<PacienteVisualizarDto> listarPaciente(){
        return service.listarPaciente();
    }
}
