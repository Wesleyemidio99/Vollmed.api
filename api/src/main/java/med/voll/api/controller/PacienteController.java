package med.voll.api.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import med.voll.api.paciente.dto.PacienteDto;
import med.voll.api.repository.PacienteRepository;
import med.voll.api.services.PacienteService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;


@RestController
@RequestMapping("paciente")
@RequiredArgsConstructor
public class PacienteController {

    private final PacienteService service;
    @PostMapping
    @ResponseStatus(CREATED)
    public void cadastrar(@RequestBody @Valid PacienteDto dados){
        service.cadastrar(dados);
    }
}
