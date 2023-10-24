package com.example.demo.dto;

import com.example.demo.model.Cliente;
import com.example.demo.model.Endereco;

public record ClienteCadastroDto(String nome, String telefone, Endereco endereco) {

    public ClienteCadastroDto(Cliente cliente) {
        this(cliente.getNome(),cliente.getTelefone(),cliente.getEndereco());
    }
}
