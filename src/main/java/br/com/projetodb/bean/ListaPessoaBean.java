package br.com.projetodb.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.projetodb.dao.dadoDao;
import br.com.projetodb.modelo.Pessoa;

@Model
public class ListaPessoaBean {
	
	 @Inject
     private dadoDao dao;
	
	private List<Pessoa> pessoas = new ArrayList<>();

    public List<Pessoa> getPessoas() {
    	this.pessoas = dao.listar();
    	
        return pessoas;
    }
}
