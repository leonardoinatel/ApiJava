package com.api.challenge.controller.dto;

import com.api.challenge.model.Usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JogoRequest {

  private Usuario usuario;
}
