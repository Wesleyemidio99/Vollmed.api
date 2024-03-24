package med.voll.api.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import med.voll.api.medico.dto.MedicosDTO;
import med.voll.api.services.MedicosService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("medicos")
@RequiredArgsConstructor
public class MedicoController {

    private final MedicosService service;

    @PostMapping
    @ResponseStatus(CREATED)
    public void cadstrar(@RequestBody @Valid MedicosDTO dados){
        service.cadastrar(dados);
    }


}
