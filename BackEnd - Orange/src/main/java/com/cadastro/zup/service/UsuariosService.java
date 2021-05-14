package com.cadastro.zup.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.zup.model.CadastroUsuarios;
import com.cadastro.zup.repository.UsuariosRepository;




@Service
public class UsuariosService {

	private @Autowired UsuariosRepository repositoryUsuarios;

	

		   public Optional<CadastroUsuarios> findAllByNome(String nome){
		      return repositoryUsuarios.findAllByNome(nome);
		    }


}