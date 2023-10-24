package org.example.exposition;

import org.example.application.IAdresseService;
import org.example.application.IClientService;
import org.example.domaine.Adress;
import org.example.domaine.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/adresse")
public class AdresseController {

    @Autowired
    IAdresseService service;

    @PostMapping
    public void create(@RequestBody Adress a){
        service.create(a);
    }

}
