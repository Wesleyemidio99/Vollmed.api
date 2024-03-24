package med.voll.api.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import med.voll.api.medico.dto.MedicoVisualizarDto;
import med.voll.api.medico.dto.MedicosDTO;
import med.voll.api.services.MedicosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicos")
@RequiredArgsConstructor
public class MedicoController {

    private final MedicosService service;

    @PostMapping
    public void cadastrar(@RequestBody @Valid MedicosDTO dados){
        service.cadastrar(dados);
    }

    @GetMapping
    public List<MedicoVisualizarDto> listaMedicos(){
        return service.listarMedicos();
    }


}
