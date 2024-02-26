package med.voll.api.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import med.voll.api.medico.Medico;
import med.voll.api.medico.dto.DadosCadastroMedico;
import med.voll.api.medico.MedicosRepository;
import med.voll.api.services.MedicosService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
@RequiredArgsConstructor
public class MedicoController {

    private final MedicosService service;

    @PostMapping
    public void cadstrar(@RequestBody @Valid DadosCadastroMedico dados){
        service.cadastrar(dados);
    }


}
