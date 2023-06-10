package com.example.api.controller;

import com.example.api.dto.NovoAutorRequest;
import com.example.api.model.Autor;
import com.example.api.repository.AutorRepository;
import com.example.api.validator.UniqueEmail;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;
    @Autowired
    private UniqueEmail uniqueEmail;

    @InitBinder
    public void init(WebDataBinder binder) {
        binder.addValidators(uniqueEmail);
    }

    @PostMapping
    public String postAutor(@RequestBody @Valid NovoAutorRequest request) {
        Autor autor = request.toModel();
        autorRepository.save(autor);
        return autor.toString();
    }
}
