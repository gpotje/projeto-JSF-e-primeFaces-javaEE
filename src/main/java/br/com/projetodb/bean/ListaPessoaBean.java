package br.com.projetodb.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.projetodb.dao.dadoDao;
import br.com.projetodb.modelo.Endereco;
import br.com.projetodb.modelo.Pessoa;


@Model
public class ListaPessoaBean {
	@Inject
	private dadoDao dao;
	
	@Inject
	 private PessoaBean bean;
	
	private Pessoa pessoa = new Pessoa();

	private Endereco endereco = new Endereco();

	
	public List<Pessoa> getPessoas() {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas = dao.listar();

		return pessoas;
	}


	@Transactional
	public void removePessoa(Pessoa p) {
		dao.removePesssoa(p);

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
