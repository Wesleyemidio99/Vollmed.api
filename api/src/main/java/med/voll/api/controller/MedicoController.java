package med.voll.api.controller;

import lombok.RequiredArgsConstructor;
import med.voll.api.endereco.Endereco;
import med.voll.api.medico.Medico;
import med.voll.api.medico.dto.DadosCadastroMedico;
import med.voll.api.medico.MedicosRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
@RequiredArgsConstructor
public class MedicoController {

    private final MedicosRepository repository;

    @PostMapping
    public void cadstrar(@RequestBody DadosCadastroMedico dados){

        repository.save(new Medico(dados));
    }

}
