package org.example.exposition;

import org.example.application.IClientService;
import org.example.domaine.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

    @Autowired
    IClientService service;

    @PostMapping
    public void create(@RequestBody Client c){
        service.create(c);
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable("id") Long id){
        return service.findById(id);
    }

}
