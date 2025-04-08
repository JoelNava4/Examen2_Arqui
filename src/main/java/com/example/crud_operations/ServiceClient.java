package com.example.crud_operations;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.stereotype.Service;

@Service
public class ServiceClient {

    private final ClientApi apiClient;

    public ServiceClient(ClientApi apiClient) {
        this.apiClient = apiClient;
    }

    @Operation(
            summary = "Create a new client",
            description = "Creates a new client based on the provided request data.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Client created successfully",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = ResponsesClient.class))
                    ),
                    @ApiResponse(
                            responseCode = "400",
                            description = "Client already exists",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = ResponsesClient.class))
                    )
            }
    )
    public ResponsesClient createClient(
            @Parameter(description = "Request data for creating a client", required = true)
            RequestClient request) {

        boolean success = apiClient.createClient(request);

        if (success) {
            return new ResponsesClient(true, "Client created successfully.");
        } else {
            return new ResponsesClient(false, "Client already exists.");
        }
    }
}

