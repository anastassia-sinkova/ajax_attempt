package com.helmes.sectors.service;

import com.helmes.sectors.domain.Client;
import com.helmes.sectors.domain.ClientDTO;
import com.helmes.sectors.repository.ClientRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ClientService {
    private ClientRepository clientRepository;

    public int saveClient(ClientDTO client) {
        log.debug("Saving client");

        Client clientEntity = new Client();

        clientEntity.setName(client.getUsername());
//        clientEntity.setAgreement(client.getAgreement());

        Client result = clientRepository.save(clientEntity);

        return result.getId();
    }
}
