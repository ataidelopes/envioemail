package br.com.api;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
@RequiredArgsConstructor
public class EnviarEmailService {


    private JavaMailSender javaMailSender;


    public void enviarEmail(String assunto,
                            String destinatarios,
                            String aliasRemetente,
                            String comCopia,
                            String comCopiaOculta,
                            String corpo,
                            String empresa,
                            String formato,
                            String remetente,
                            File template ) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(destinatarios);
        message.setSubject(assunto);
        message.setFrom(remetente);
        message.setText(corpo);

        javaMailSender.send(message);
    }

}
