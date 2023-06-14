package com.example.api.controller;

import com.example.api.dto.CategoriaRequest;
import com.example.api.dto.CategoriaResponse;
import com.example.api.model.Categoria;
import com.example.api.repository.CategoriaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

    @Autowired
    CategoriaRepository categoriaRepository;

    @PostMapping
    public CategoriaResponse addCategoria(@RequestBody @Valid CategoriaRequest request) {
        Categoria novaCategoria = request.toModel();
        Categoria categoria = categoriaRepository.save(novaCategoria);
        return new CategoriaResponse(categoria.getNome()).convertToDto();
    }
}
