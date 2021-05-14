package com.cadastro.zup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.zup.model.CadastroEnderecos;
import com.cadastro.zup.repository.EnderecosRepository;

@RestController
@RequestMapping("/enderecos")
@CrossOrigin("*")
public class EnderecosController {
	
	@Autowired
	private EnderecosRepository repository;
	
	

	// Cadastro dos endereços
	
	@PostMapping
	public ResponseEntity<CadastroEnderecos> post (@RequestBody CadastroEnderecos endcadastro) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(endcadastro));
	}
	
	
}