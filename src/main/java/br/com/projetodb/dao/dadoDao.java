package br.com.projetodb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.projetodb.modelo.Pessoa;

public class dadoDao {

	@PersistenceContext
	private EntityManager manager;

	public void salvarPessoa(Pessoa p) {
		manager.persist(p);
	}

	public List<Pessoa> listar() {
		String jpql = "select distinct(l) from tb_pessoa l" 
	+ " join fetch l.tb_endereco";

		return manager.createQuery(jpql, Pessoa.class).getResultList();
	}

}
