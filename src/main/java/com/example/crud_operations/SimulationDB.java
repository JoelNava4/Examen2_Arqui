package com.example.crud_operations;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class SimulationDB implements ClientApi {
    private final Set<String> identityDocuments;

    public SimulationDB() {
        identityDocuments = new HashSet<>();
    }

    @Override
    public boolean createClient(RequestClient clientRequest) {
        if (identityDocuments.contains(clientRequest.identityDocument())) {
            return false;
        }
        identityDocuments.add(clientRequest.identityDocument());
        return true;
    }
}
