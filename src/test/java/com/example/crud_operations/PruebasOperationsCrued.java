package com.example.crud_operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PruebasOperationsCrued {
    private ClientApi apiClient;
    private ServiceClient clientService;

    @BeforeEach
    void setUp() {
        apiClient = Mockito.mock(ClientApi.class);
        clientService = new ServiceClient(apiClient);
    }

    @Test
    void createClientSuccess() {
        RequestClient requestDto = new RequestClient("Joel", "Navarro", "Flores", "1234");
        when(apiClient.createClient(requestDto)).thenReturn(true);

        ResponsesClient response = clientService.createClient(requestDto);
        assertTrue(response.success());
        assertEquals("Client created successfully.", response.message());
        verify(apiClient).createClient(requestDto);
    }

    @Test
    void createClientAlreadyExists() {
        RequestClient requestDto = new RequestClient("Joel", "Navarro", "Flores", "1234");
        when(apiClient.createClient(requestDto)).thenReturn(false);

        ResponsesClient response = clientService.createClient(requestDto);
        assertFalse(response.success());
        assertEquals("Client already exists.", response.message());
        verify(apiClient).createClient(requestDto);
    }
}
