package com.example.crud_operations;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Representa una solicitud para crear un nuevo cliente.
 * Este record contiene la información básica necesaria para la creación de un cliente.
 */
@Schema(description = "Representa una solicitud para crear un nuevo cliente con su información personal.")
public record RequestClient(

        /**
         * Primer nombre del cliente.
         */
        @Schema(description = "Primer nombre del cliente.", example = "Juan")
        String firstName,

        /**
         * Apellido paterno del cliente.
         */
        @Schema(description = "Apellido paterno del cliente.", example = "Pérez")
        String paternalLastName,

        /**
         * Apellido materno del cliente.
         */
        @Schema(description = "Apellido materno del cliente.", example = "González")
        String maternalLastName,

        /**
         * Documento de identidad del cliente (ej. DNI, pasaporte).
         */
        @Schema(description = "Documento de identidad del cliente (DNI, pasaporte, etc.).", example = "123456789")
        String identityDocument
) {
}

