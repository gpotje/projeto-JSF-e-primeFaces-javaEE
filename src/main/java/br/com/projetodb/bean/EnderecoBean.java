package br.com.projetodb.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.projetodb.dao.dadoDao;
import br.com.projetodb.modelo.Endereco;
import br.com.projetodb.modelo.Pessoa;

@Named
@RequestScoped
public class EnderecoBean {

	private Endereco endereco = new Endereco();

	
}
