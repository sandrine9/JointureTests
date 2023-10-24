package org.example.application;

import org.example.domaine.Adress;
import org.example.infra.IAdressRepo;
import org.example.infra.IClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdresseServiceImpl implements IAdresseService {

    @Autowired
    IAdressRepo adressRepo;
    @Override
    public void create(Adress a) {adressRepo.save(a); }
}
