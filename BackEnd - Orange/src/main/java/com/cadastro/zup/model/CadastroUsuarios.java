/*O primeiro passo deve ser a construção de um cadastro de usuários, sendo obrigatório dados como: 
  nome, e-mail, CPF e data de nascimento, onde e-mail e CPF devem ser únicos.*/

package com.cadastro.zup.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="usuarios")
public class CadastroUsuarios {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nome;
	
	@NotNull @Column(unique = true)
	private String email;
	
	@NotNull @Column(unique = true)
	private long cpf;
	
	@NotNull 
	private Date nascimento;
	
	
	@OneToMany(mappedBy= "cadastroUsuarios", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties ("cadastroUsuarios")
	private List<CadastroEnderecos> cadastroEnderecos;


	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getCpf() {
		return cpf;
	}


	public void setCpf(long cpf) {
		this.cpf = cpf;
	}


	public Date getNascimento() {
		return nascimento;
	}


	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


	public List<CadastroEnderecos> getCadastroEnderecos() {
		return cadastroEnderecos;
	}


	public void setCadastroEnderecos(List<CadastroEnderecos> cadastroEnderecos) {
		this.cadastroEnderecos = cadastroEnderecos;
	}


	
	
}