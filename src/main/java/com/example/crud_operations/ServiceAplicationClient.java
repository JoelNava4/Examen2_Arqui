package com.example.crud_operations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * La clase principal que inicia la aplicación Spring Boot.
 * Esta clase está marcada con la anotación @SpringBootApplication para permitir
 * la inicialización del contexto y las configuraciones de la aplicación.
 *
 * @SpringBootApplication es una combinación de @Configuration, @EnableAutoConfiguration
 * y @ComponentScan, lo que permite que Spring Boot configure y arranque la aplicación.
 */
@SpringBootApplication
public class ServiceAplicationClient {

    /**
     * Método principal para arrancar la aplicación Spring Boot.
     *
     * @param args Argumentos de la línea de comandos para arrancar la aplicación.
     */
    @Operation(
            summary = "Arranca la aplicación Spring Boot",
            description = "Este es el punto de entrada principal para la aplicación Spring Boot. " +
                    "Este método inicializa y arranca el contexto de la aplicación."
    )
    public static void main(String[] args) {
        SpringApplication.run(ServiceAplicationClient.class, args);
    }
}
