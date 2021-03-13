package br.com.projetodb.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.projetodb.dao.dadoDao;
import br.com.projetodb.modelo.Endereco;
import br.com.projetodb.modelo.Pessoa;

@Named
@RequestScoped
public class PessoaBean {
	
	private Pessoa pessoa =  new Pessoa();

	@Inject
	private dadoDao dao;

	
	@Inject
	private Endereco endereco;
	
	@Transactional
	public void salvarFomulario() {
		
		dao.salvarPessoa(pessoa);
		System.out.println(pessoa.toString());
		
		//return "/pessoa/listar?faces-redirect=true";
	}
	

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
	

}
