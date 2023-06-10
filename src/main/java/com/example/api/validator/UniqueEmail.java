package com.example.api.validator;

import com.example.api.dto.NovoAutorRequest;
import com.example.api.model.Autor;
import com.example.api.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;

@Component
public class UniqueEmail implements Validator {

    @Autowired
    AutorRepository autorRepository;

    @Override
    public boolean supports(Class<?> clazz) {
        return NovoAutorRequest.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if(errors.hasErrors()){
            return;
        }
        NovoAutorRequest request = (NovoAutorRequest) target;
        Optional<Autor> possivelAutor = autorRepository.findByEmail(request.getEmail());

        if(possivelAutor.isPresent()){
            errors.reject("Email", null, "Já existe um autor com esse email cadastrado");
        }
    }
}
