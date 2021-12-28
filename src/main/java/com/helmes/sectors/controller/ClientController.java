package com.helmes.sectors.controller;

import com.helmes.sectors.domain.ClientDTO;
import com.helmes.sectors.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ClientController {

    private ClientService clientService;

    @PostMapping("/clients")
    public ResponseEntity<?> saveClient(@RequestBody ClientDTO client) {
        //TODO: validation
        int result = clientService.saveClient(client);
        System.out.println(client);
        return ResponseEntity.ok(result);
    }
}

