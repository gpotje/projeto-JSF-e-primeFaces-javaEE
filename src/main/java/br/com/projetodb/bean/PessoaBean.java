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
public class PessoaBean {

	private Pessoa pessoa = new Pessoa();

	private Endereco endereco = new Endereco();
	
	private List<Endereco> enderecoLista = new ArrayList<>();
	
	
	
	@Inject
	private dadoDao dao;

	@Transactional
	public String salvarFomulario() {

		dao.salvarPessoa(pessoa);
		endereco.setPessoa(pessoa);
		dao.salvarEndereco(endereco);
		
//		for (Endereco enderecoLis : enderecoLista) {
//			enderecoLis.setPessoa(pessoa);
//			System.out.println(endereco.toString());
//			dao.salvarEndereco(enderecoLis);
//		}
		
		
		System.out.println(pessoa.toString());
		System.out.println(endereco.toString());
		
		return "/pessoa/listar?faces-redirect=true";

	}
	
	
//	public void addNovoEndereco() {
//		
//		
//		enderecoLista.add(endereco);
//		
//		System.out.println("2" + endereco.toString());
//		this.endereco = new Endereco(); 
//		System.out.println("3" + endereco.toString());
//		
//	}
	
	

	public void teste() {
			System.out.println("funciona");
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

	public List<Endereco> getEnderecoLista() {
		return enderecoLista;
	}

	public void setEnderecoLista(List<Endereco> enderecoLista) {
		this.enderecoLista = enderecoLista;
	}

	
	
	
	

}
