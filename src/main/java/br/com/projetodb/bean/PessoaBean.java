package br.com.projetodb.bean;

import java.util.ArrayList;
import java.util.Arrays;
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

	private Pessoa pessoa = new Pessoa();

	private Endereco endereco = new Endereco();
	

	@Inject
	private dadoDao dao;

	@Transactional
	public String salvarFomulario() {

		dao.salvarPessoa(pessoa);
		endereco.setPessoa(pessoa);
//		if(endereco2 == null) {
//			dao.salvarEndereco(endereco);
//		}
//		endereco2.setPessoa(pessoa);
		dao.salvarEndereco(endereco);
		
		System.out.println(pessoa.toString());
		System.out.println(endereco.toString());
		
		return "/pessoa/listar?faces-redirect=true";

	}

	public void teste() {

	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	

	
	

}
