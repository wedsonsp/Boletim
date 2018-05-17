/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.boletim.controllers;

import br.com.bandtec.boletim.repository.BoletimRepository;
import com.bandtec.boletimapi.domain.Boletim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boletim")

public class BoletimController {

    @Autowired
    private BoletimRepository repository;

    @GetMapping
    public ResponseEntity getTodos() {
        Iterable<Boletim> boletins = this.repository.findAll();

        return ResponseEntity.ok(boletins);
    }

    @PostMapping
    public ResponseEntity criar(@RequestBody Boletim boletim) {

        this.repository.save(boletim);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluir(
            @PathVariable("id") Integer id) {

        this.repository.delete(id);

        return ResponseEntity.ok().build();
    }

    // Falta o Atualizar.
    
    //Falta o método Recuperar Um.
}
