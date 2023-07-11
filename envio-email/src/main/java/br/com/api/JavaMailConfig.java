package br.com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class JavaMailConfig {

    private final EmailsProperties emailsProperties;

    @Autowired
    public JavaMailConfig(final EmailsProperties emailsProperties) {
        this.emailsProperties = emailsProperties;
    }

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(emailsProperties.getHost());
        mailSender.setPort(emailsProperties.getPort());
        mailSender.setUsername(emailsProperties.getUsername());
        mailSender.setPassword(emailsProperties.getPassword());

        return mailSender;
    }

}
