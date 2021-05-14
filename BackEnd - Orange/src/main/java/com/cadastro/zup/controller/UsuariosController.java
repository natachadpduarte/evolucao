package com.cadastro.zup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.cadastro.zup.model.CadastroUsuarios;
import com.cadastro.zup.repository.UsuariosRepository;
import com.cadastro.zup.service.UsuariosService;



@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuariosController {
	
	@Autowired
	 private UsuariosRepository repository;
	
	 @Autowired
	 UsuariosService usuariosService;
	
	

	// Cadastro dos usuários
	 
	@PostMapping
	public ResponseEntity<CadastroUsuarios> post (@RequestBody CadastroUsuarios usercadastro) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(usercadastro));
	}
	
	
	// Listagem dos endereços de um usuário específico
	
    @GetMapping("buscaUsuario/{nome}")
    public CadastroUsuarios findAllByNome(@PathVariable String nome) {
        return usuariosService.findAllByNome(nome)
          .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado em nossa base de dados."));

    }
}



