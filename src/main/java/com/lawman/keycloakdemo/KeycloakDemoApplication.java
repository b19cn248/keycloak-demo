package com.lawman.keycloakdemo;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
      servers = {
            @io.swagger.v3.oas.annotations.servers.Server(url = "${auth.server.url}", description = "Auth Service"),
      },
      info = @Info(
            title = "USERS microservice REST API Documentation",
            description = "Shop Sport Users microservice REST API Documentation",
            version = "v1",
            contact = @Contact(
                  name = "Hieu PTIT",
                  email = "hieunm123.ptit@gmail.com",
                  url = "https://openlearnhub.substack.com/"
            ),
            license = @License(
                  name = "Apache 2.0",
                  url = "https://openlearnhub.substack.com/"
            )
      ),
      externalDocs = @ExternalDocumentation(
            description = "SHOP SPORT microservice REST API Documentation",
            url = "https://openlearnhub.substack.com/"
      )
)
public class KeycloakDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(KeycloakDemoApplication.class, args);
  }

}
