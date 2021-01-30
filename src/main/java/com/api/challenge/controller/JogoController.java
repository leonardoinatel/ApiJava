package com.api.challenge.controller;

import java.util.List;

import com.api.challenge.controller.dto.JogoRequest;
import com.api.challenge.model.Usuario;
import com.api.challenge.repository.ApostaRepository;
import com.api.challenge.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class JogoController {
  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private ApostaRepository apostaRepository;

  @PostMapping("/fazerAposta")
  public Usuario fazerAposta(@RequestBody JogoRequest request) {
    return usuarioRepository.save(request.getUsuario());
  }

  @GetMapping("/")
  public List<Usuario> findAllAposta() {
    return usuarioRepository.findAll();
  }
}
