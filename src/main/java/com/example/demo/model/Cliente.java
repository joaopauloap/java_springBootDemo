package com.example.demo.model;

import com.example.demo.dto.ClienteAtualizacaoDto;
import com.example.demo.dto.ClienteCadastroDto;

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
	public Cliente(ClienteCadastroDto data) {
		this.nome = data.nome();
		this.telefone = data.telefone();
		this.endereco = data.endereco();
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String telefone;
	
	@Embedded
	private Endereco endereco;

	public void atualizarInformacoes(ClienteAtualizacaoDto data) {
		if(data.nome()!=null) {
			this.nome = data.nome();
		}
		
		if(data.telefone()!=null) {
			this.telefone = data.telefone();
		}
		
		if(data.endereco()!=null) {
			this.endereco = data.endereco();
		}
	}
}
