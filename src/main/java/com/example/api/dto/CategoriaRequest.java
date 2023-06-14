package com.example.api.dto;

import com.example.api.model.Categoria;
import jakarta.validation.constraints.NotBlank;

public class CategoriaRequest {

    private final String nome;

    public CategoriaRequest(@NotBlank String nome) {
        this.nome = nome;
    }

    public Categoria toModel() { return new Categoria(this.nome); }
}
