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

// exemplo de requisicao post

// {
//   "email": "jao123@gmail.com"
// }

public class JogoController {
  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private ApostaRepository apostaRepository;

  @PostMapping("/fazerAposta")
  public Usuario fazerAposta(@RequestBody JogoRequest request) {
    // aqui eu pensei em geral um array de numeros aleatorios
    // e depois encapsular esse numero a a requisição e so depois salvar no banco
    return usuarioRepository.save(request.getUsuario());
  }

  @GetMapping("/buscarAposta")
  public List<Usuario> findAllAposta() {
    return usuarioRepository.findAll();
  }
}
