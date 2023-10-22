package com.example.softwaymedicalcodingtest.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Softway Medical",
                description = "coding game v3 pour : Abdallah Hameur Lain",
                contact = @Contact(
                        name = "HL Abdallah",
                        url = "https://github.com/HL-Abdallah"
                ),
                version = "1"
        ),
        servers = {
                @Server(
                        url = "localhost:8080",
                        description = "Serveur Local"
                )
        }
)
@Configuration
public class SwaggerConfig {
}
