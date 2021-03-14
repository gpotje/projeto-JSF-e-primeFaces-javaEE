package br.com.projetodb.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.projetodb.dao.dadoDao;
import br.com.projetodb.modelo.Endereco;
import br.com.projetodb.modelo.Pessoa;

@Model
public class ListaPessoaBean {
	
	 @Inject
     private dadoDao dao;
	 
	private Pessoa pessoa;

	private Endereco endereco = new Endereco();
	
	 private List<Pessoa> pessoas = new ArrayList<>();

    public List<Pessoa> getPessoas() {
    	this.pessoas = dao.listar();
    	
        return pessoas;
    }
    
   
    public void alteraPessoa(Pessoa p) {
    	System.out.println("funciona");
    	//System.out.println("" +p);
		this.pessoa = p;
    	
    }
    public void alteraPessoa2() {
    	System.out.println("funciona");
    	
    	
    }
//    public String AddEndereco(Pessoa p) {
//    	System.out.println("funciona");
//    	
//    	FacesContext.getCurrentInstance().getExternalContext()
//    	.getFlash().put("pessoa", p);
//    	
//    	return "/pessoa/AddEndereco?faces-redirect=true";
//    	
//    }
    
    public String editaPessoa(Pessoa pessoaEditar) {
    	System.out.println("funciona edita");
    	
    	FacesContext.getCurrentInstance().getExternalContext()
    	.getFlash().put("pessoaEditar", pessoaEditar);
    	
    	return "/pessoa/EditaPessoa?faces-redirect=true";
    	
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
