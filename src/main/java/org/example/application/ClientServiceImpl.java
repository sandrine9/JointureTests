package org.example.application;

import org.example.domaine.Client;
import org.example.infra.IClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    IClientRepo clientRepo;
    @Override
    public void create(Client c) {clientRepo.save(c);    }

    @Override
    public Client findById(Long id) {
        return clientRepo.findById(id).get();
    }
}
