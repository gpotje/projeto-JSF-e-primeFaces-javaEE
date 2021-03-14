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
	 
	private Pessoa pessoa = new Pessoa();

	private Endereco endereco = new Endereco();
	
	 private List<Pessoa> pessoas = new ArrayList<>();

    public List<Pessoa> getPessoas() {
    	this.pessoas = dao.listar();
    	
        return pessoas;
    }
    
    @Transactional
	public String salvarFomulario() {

		dao.salvarPessoa(pessoa);

		System.out.println(pessoa.toString());
		System.out.println(endereco.toString());

		return "/pessoa/listarPessoa?faces-redirect=true";

	}
    public void AlteraPessoa(Pessoa p) {
    	System.out.println("Carregando livro");
    	
    	
    	
    }


	
	@Transactional
	public void removePessoa(Pessoa p) {
		dao.removePesssoa(p);
		
	}
	
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
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
