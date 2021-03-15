package br.com.projetodb.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.projetodb.dao.dadoDao;
import br.com.projetodb.modelo.Endereco;
import br.com.projetodb.modelo.Pessoa;


@Named
@ViewScoped
public class ListaPessoaBean  implements Serializable{
	
	private static final long serialVersionUID = 1L;

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
	public String removePessoa(Pessoa p) {
		dao.removePesssoa(p);
		return "/pessoa/listarPessoa?faces-redirect=true";
	}
	
	public void AlteraPessoa(Pessoa p) {
		
		System.out.println("deu certo");
		this.pessoa = p;
		
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
