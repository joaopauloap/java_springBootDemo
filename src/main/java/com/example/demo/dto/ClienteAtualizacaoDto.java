package com.example.demo.dto;

import com.example.demo.model.Cliente;
import com.example.demo.model.Endereco;

public record ClienteAtualizacaoDto(Long id, String nome, String telefone, Endereco endereco) {

}
