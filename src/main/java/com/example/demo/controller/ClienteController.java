package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ClienteDto;
import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	@PostMapping
	public String cadastrar(@RequestBody ClienteDto data) {
		clienteRepository.save(new Cliente(data));
		return "Cadastrado";
	}
	
}
