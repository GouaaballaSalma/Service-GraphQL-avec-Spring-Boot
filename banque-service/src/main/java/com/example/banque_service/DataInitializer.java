package com.example.banque_service;

import com.example.banque_service.entities.Compte;
import com.example.banque_service.entities.TypeCompte;
import com.example.banque_service.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DataInitializer implements CommandLineRunner {

    private final CompteRepository compteRepository;

    public DataInitializer(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        compteRepository.save(new Compte(null, 1000.0, new Date(), TypeCompte.COURANT));
        compteRepository.save(new Compte(null, 2500.0, new Date(), TypeCompte.EPARGNE));
    }
}