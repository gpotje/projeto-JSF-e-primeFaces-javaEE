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
public class PessoaBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Pessoa pessoa = new Pessoa();

	private Endereco endereco = new Endereco();
	
	private List<Endereco> end = new ArrayList<>();

	@Inject
	private dadoDao dao;

	@Transactional
	public String salvarFomulario() {
		
		dao.salvarPessoa(pessoa);
		
		for (Endereco endereco : end) {
			endereco.setPessoa(pessoa);
			dao.salvarEndereco(endereco);
			System.out.println("endereco");
		}

		return "/pessoa/listarPessoa?faces-redirect=true";

	}

	
	public void AddEndereco() {
		end.add(this.endereco);
		this.endereco = new Endereco();
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
