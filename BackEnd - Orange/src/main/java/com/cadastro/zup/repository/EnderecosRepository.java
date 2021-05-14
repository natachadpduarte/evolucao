package com.cadastro.zup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.zup.model.CadastroEnderecos;

@Repository
public interface EnderecosRepository extends JpaRepository <CadastroEnderecos, Long> {


}