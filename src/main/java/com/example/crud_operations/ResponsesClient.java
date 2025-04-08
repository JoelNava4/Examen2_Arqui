package com.example.crud_operations;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Respuesta estándar para las operaciones con clientes.
 * Este record representa el resultado de una operación con el cliente.
 */
@Schema(description = "Representa la respuesta estándar de una operación con el cliente.")
public record ResponsesClient(

        /**
         * Indica si la operación fue exitosa o no.
         */
        @Schema(description = "Indica si la operación fue exitosa.", example = "true")
        boolean success,

        /**
         * Mensaje asociado a la operación.
         */
        @Schema(description = "Mensaje que explica el resultado de la operación.", example = "Client created successfully.")
        String message
) {
}
