package med.voll.api.controller;

import lombok.extern.slf4j.Slf4j;
import med.voll.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("paciente")
public class PacienteController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPaciente dados){
        log.info("Dados recebidos do paciente: {}", dados);
    }
}
