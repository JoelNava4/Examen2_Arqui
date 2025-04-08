package com.example.crud_operations;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Componente que simula una base de datos en memoria para almacenar documentos de identidad de clientes.
 */
@Component
public class SimulationDB implements ClientApi {

    private final Set<String> identityDocuments;

    public SimulationDB() {
        identityDocuments = new HashSet<>();
    }

    /**
     * Crea un nuevo cliente si su documento de identidad no ha sido registrado previamente.
     *
     * @param clientRequest Objeto con los datos del cliente.
     * @return {@code true} si el cliente fue creado exitosamente, {@code false} si el documento ya existía.
     */
    @Override
    @Operation(
            summary = "Crear un nuevo cliente",
            description = "Registra un cliente si su documento de identidad no ha sido previamente utilizado."
    )
    public boolean createClient(
            @Parameter(description = "Datos del cliente a registrar", required = true)
            RequestClient clientRequest
    ) {
        if (identityDocuments.contains(clientRequest.identityDocument())) {
            return false;
        }
        identityDocuments.add(clientRequest.identityDocument());
        return true;
    }
}
