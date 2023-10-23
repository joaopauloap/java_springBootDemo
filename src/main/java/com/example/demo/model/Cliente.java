package com.example.demo.model;

import com.example.demo.dto.ClienteDto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "clientes")
@Entity(name = "Cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Cliente {
	public Cliente(ClienteDto data) {
		this.nome = data.nome();
		this.idade = data.idade();
		this.telefone = data.telefone();
		this.endereco = new Endereco();
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int idade;
	private String nome;
	private String telefone;
	
	@Embedded
	private Endereco endereco;
}
