package com.example.api.dto;

public class CategoriaResponse {

    private final String nome;

    public CategoriaResponse(String nome) {
        this.nome = nome;
    }

    public CategoriaResponse convertToDto() {
        return new CategoriaResponse(nome);
    }
}
