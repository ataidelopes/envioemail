package br.com.api;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("spring.mail")
public class EmailsProperties {

    private String host;
    private int port;
    private String username;
    private String password;
}
