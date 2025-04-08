package com.example.crud_operations;

import org.springframework.stereotype.Service;

@Service
public class ServiceClient {
    private final ClientApi apiClient;

    public ServiceClient(ClientApi apiClient) {
        this.apiClient = apiClient;
    }

    public ResponsesClient createClient(RequestClient request) {
        boolean success = apiClient.createClient(request);
        if (success) {
            return new ResponsesClient(true, "Client created successfully.");
        } else {
            return new ResponsesClient(false, "Client already exists.");
        }
    }
}
