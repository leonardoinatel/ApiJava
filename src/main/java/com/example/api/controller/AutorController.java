package com.example.api.controller;

import com.example.api.dto.NovoAutorRequest;
import com.example.api.model.Autor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @PersistenceContext
    private EntityManager manager;

    @PostMapping
    @Transactional
    public String postAutor(@RequestBody @Valid NovoAutorRequest request) {
        Autor autor = request.toModel();
        manager.persist(autor);
        return autor.toString();
    }
}
