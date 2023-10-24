package com.example.demo.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

	public String logradouro;
	public String bairro;
	public String cep;
	public int numero;
	public String complemento;
	public String cidade;
	public String uf;
}
