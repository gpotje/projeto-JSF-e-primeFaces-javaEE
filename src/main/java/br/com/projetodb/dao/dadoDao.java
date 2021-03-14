package br.com.projetodb.dao;

import java.util.List;

import javax.management.Query;
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

	public void removePesssoa(Pessoa p) {
		Pessoa pApagar = manager.merge(p);
		manager.remove(pApagar);
	}
	
	

	public List<Pessoa> listar() {
		String jpql = "select p from Pessoa p" + " join fetch p.end";

		return manager.createQuery(jpql, Pessoa.class).getResultList();

	}
	
	public Integer criaID() {
		String jpql = "select count(p) from Endereco p"  ;
		Integer IdFinal = manager.createQuery(jpql, Integer.class).getSingleResult();
		IdFinal++;
		System.out.println("final criaID");
		return IdFinal;
		
	}
	
//	public void inserirEnderecoNovo(Long idPessoa,Endereco e) {
//		int idEndereco = criaID();
//		
//		String jpql = "INSERT INTO Endereco (IDENDERECO,CEP,NUMEROLOCALIDADE,PESSOA_IDPESSOA) "
//				+ "VALUES (:idendereco,:cep,:numerolocalicade,:idpessoa)"  ;
//		
//		
//		Query query = manager.create
//	
//		
//	}
	
	
	

}
