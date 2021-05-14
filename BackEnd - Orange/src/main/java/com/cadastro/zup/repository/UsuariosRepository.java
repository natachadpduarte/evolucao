package com.cadastro.zup.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.zup.model.CadastroUsuarios;

@Repository
public interface UsuariosRepository extends JpaRepository <CadastroUsuarios, Long> {

	
	public Optional<CadastroUsuarios> findAllByNome (String nome);

	


}