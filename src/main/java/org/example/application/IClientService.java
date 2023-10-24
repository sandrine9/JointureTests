package org.example.application;

import org.example.domaine.Client;

public interface IClientService {
    public void create(Client c);

    public Client findById(Long id);
}
