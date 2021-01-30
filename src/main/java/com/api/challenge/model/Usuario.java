package com.api.challenge.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "usuario")
public class Usuario {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  private String email;

  @OneToMany(targetEntity = Aposta.class, cascade = CascadeType.ALL)
  @JoinColumn(name =  "user_fk", referencedColumnName = "id")  
  private List<Aposta> apostas;
}
