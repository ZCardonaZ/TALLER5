package com.example.taller5.controller;

import com.example.taller5.repository.RepositoryTaller5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    @Autowired
    private RepositoryTaller5 repository;

    @GetMapping("/n_ejemplo/{numeroVentas}")
    public String comision(@PathVariable int numeroVentas){
        return repository.comision( numeroVentas );
    }

    @GetMapping("/asignar_ranking/{letra}")
    public String rankear(@PathVariable String letra){
        return repository.rankear( letra.toUpperCase() );
    }
}
