package com.example.demo.dto;

import com.example.demo.model.Endereco;

public record ClienteDto(String nome, int idade, String telefone, Endereco endereco) {

}
