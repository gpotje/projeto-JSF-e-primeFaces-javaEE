package br.com.projetodb.dao;

import java.awt.Window.Type;
import java.util.List;

import javax.enterprise.inject.Typed;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import br.com.projetodb.modelo.Endereco;
import br.com.projetodb.modelo.Pessoa;

public class dadoDao {

	@PersistenceContext
	private EntityManager manager;

	public void salvarPessoa(Pessoa p) {
		manager.persist(p);
	}
	public void salvarEndereco(Endereco e) {
		manager.persist(e);
	}
	
	public List<Pessoa> listaTodasPessoas() {
		
		CriteriaQuery<Pessoa> query = manager.getCriteriaBuilder().createQuery(Pessoa.class);
		query.select(query.from(Pessoa.class));

		List<Pessoa> lista = manager.createQuery(query).getResultList();

		manager.close();
		return lista;
	}

	
	public List<Pessoa> listar() {
		String jpql = "select p from Pessoa p"
   + " join fetch p.end";

		return manager.createQuery(jpql, Pessoa.class).getResultList();
		
		
	}

}
