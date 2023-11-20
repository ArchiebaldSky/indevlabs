package com.example.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Title",
                version = "1.0.0",
                description = "OpenApi documentation",
                contact = @Contact(
                        name = "Artem Dobrovolsky",
                        url = "https://spb.hh.ru/resume/d55f1defff086f351a0039ed1f6a51565a494a"
                )
        )
)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
