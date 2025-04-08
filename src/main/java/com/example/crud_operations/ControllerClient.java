package com.example.crud_operations;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador que maneja las operaciones relacionadas con la creación de clientes.
 *
 * Proporciona un endpoint para crear un nuevo cliente mediante el método POST.
 */
@RestController
@RequestMapping("/client")
public class ControllerClient {

    private final ServiceClient clientService;

    public ControllerClient(ServiceClient clientService) {
        this.clientService = clientService;
    }

    /**
     * Crea un nuevo cliente en el sistema.
     *
     * Este endpoint recibe la solicitud para crear un cliente y devuelve una respuesta que indica si la operación fue exitosa.
     *
     * @param clientRequestDto Los datos del cliente a crear.
     * @return Respuesta con el estado de la operación.
     */
    @PostMapping("/create")
    @Operation(
            summary = "Crear un nuevo cliente",
            description = "Este endpoint permite crear un cliente en el sistema proporcionando los datos requeridos.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Cliente creado exitosamente",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ResponsesClient.class)
                            )
                    ),
                    @ApiResponse(responseCode = "400", description = "Solicitud inválida")
            }
    )
    public ResponsesClient createClient(
            @Parameter(description = "Datos del cliente a crear", required = true)
            @RequestBody RequestClient clientRequestDto) {
        return clientService.createClient(clientRequestDto);
    }
}
