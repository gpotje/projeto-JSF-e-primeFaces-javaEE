package br.com.projetodb.bean;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.projetodb.dao.dadoDao;
import br.com.projetodb.modelo.Endereco;
import br.com.projetodb.modelo.Pessoa;

@Model
public class AddEndereco {

	
	  private Pessoa pessoa =  new Pessoa();
	 
	  private Endereco endereco = new Endereco();
	
	@Inject
	private dadoDao dao;

	@PostConstruct
	public void init() {
	     pessoa = (Pessoa) FacesContext.getCurrentInstance().
	    		 getExternalContext().getFlash().get("pessoa");
	     System.out.println("init");
	     
	}
	
	
	@Transactional
	public String AdNovoEndereco() {
	
	
		endereco.setPessoa(pessoa);
		dao.salvarEndereco(endereco);

//		System.out.println(pessoa.toString());
//		System.out.println(endereco.toString());

		return "/pessoa/listarPessoa?faces-redirect=true";

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
