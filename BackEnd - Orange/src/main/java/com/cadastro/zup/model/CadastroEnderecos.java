/*O segundo passo é criar um cadastro de endereços, sendo obrigatório dados mínimos para cadastro como: 
  logradouro, número, complemento, bairro, cidade, estado e CEP, associando este endereço ao usuário.*/

package com.cadastro.zup.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="enderecos")
public class CadastroEnderecos {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String logradouro;
	
	@NotNull
	private long numero;
	
	@NotNull
	private String complemento;
	
	@NotNull
	private String bairro;
	
	@NotNull
	private String cidade;
	
	@NotNull
	private String estado;
	
	@NotNull
	private long cep;
	

	@ManyToOne
	@JsonIgnoreProperties("cadastroEnderecos")
	private CadastroUsuarios cadastroUsuarios;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public long getNumero() {
		return numero;
	}


	public void setNumero(long numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public long getCep() {
		return cep;
	}


	public void setCep(long cep) {
		this.cep = cep;
	}


	public CadastroUsuarios getCadastroUsuarios() {
		return cadastroUsuarios;
	}


	public void setCadastroUsuarios(CadastroUsuarios cadastroUsuarios) {
		this.cadastroUsuarios = cadastroUsuarios;
	}

	
}