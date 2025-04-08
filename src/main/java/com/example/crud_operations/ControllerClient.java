package com.example.crud_operations;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ControllerClient {
    private final ServiceClient clientService;

    public ControllerClient(ServiceClient clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/create")
    public ResponsesClient createClient(@RequestBody RequestClient clientRequestDto) {
        return clientService.createClient(clientRequestDto);
    }
}
