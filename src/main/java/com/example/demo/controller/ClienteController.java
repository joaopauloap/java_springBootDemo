package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ClienteAtualizacaoDto;
import com.example.demo.dto.ClienteCadastroDto;
import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping
	public String cadastrar(@RequestBody ClienteCadastroDto data) {
		clienteRepository.save(new Cliente(data));
		return "Cadastrado";
	}

	@GetMapping
	public List<ClienteCadastroDto> listar() {
		return clienteRepository.findAll().stream().map(ClienteCadastroDto::new).toList();
	}

	@PutMapping
	@Transactional
	public String atualizar(@RequestBody ClienteAtualizacaoDto data) {
		Cliente cliente = clienteRepository.getReferenceById(data.id());
		cliente.atualizarInformacoes(data);
		return "Atualizado";
	}

	@DeleteMapping("/{id}")
	@Transactional
	public String excluir(@PathVariable Long id) {
		clienteRepository.deleteById(id);
		return "Excluido";
	}
}
