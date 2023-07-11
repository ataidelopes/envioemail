package br.com.api;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/email/enviar")
@RequiredArgsConstructor
public class EmailControllerApi {

    private EnviarEmailService enviarEmailService;

    @PostMapping
    public ResponseEntity<Void> enviarUsingPOSTCall(@RequestBody String assunto,
                                                    @RequestBody String destinatarios,
                                                    @RequestBody String aliasRemetente,
                                                    @RequestBody List<File> anexos,
                                                    @RequestBody String comCopia,
                                                    @RequestBody String comCopiaOculta,
                                                    @RequestBody String corpo,
                                                    @RequestBody String empresa,
                                                    @RequestBody String formato,
                                                    @RequestBody String remetente,
                                                    @RequestBody File template ) {


        enviarEmailService.enviarEmail(assunto,destinatarios, aliasRemetente, comCopia, comCopiaOculta,
                corpo, empresa, formato, remetente, template);

        return ResponseEntity.ok().build();
    }
}
