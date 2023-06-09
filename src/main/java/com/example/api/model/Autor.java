package com.example.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import java.time.LocalDateTime;

@Entity
public class Autor {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private @NotBlank String nome;
    private @NotBlank @Email String email;
    private @NotBlank @Size(max = 400) String descricao;
    private LocalDateTime instanteCricacao = LocalDateTime.now();

    public Autor(@NotBlank String nome, @NotBlank @Email String email, @NotBlank @Size(max = 400) String descricao) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", descricao='" + descricao + '\'' +
                ", instanteCricacao=" + instanteCricacao +
                '}';
    }

}
