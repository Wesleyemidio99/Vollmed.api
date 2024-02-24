package med.voll.api.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import med.voll.api.medico.Medico;
import med.voll.api.medico.dto.DadosCadastroMedico;
import med.voll.api.medico.MedicosRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
@RequiredArgsConstructor
public class MedicoController {

    private final MedicosRepository repository;

    @PostMapping
    @Transactional
    public void cadstrar(@RequestBody @Valid DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }
}
