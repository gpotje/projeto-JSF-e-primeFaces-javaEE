package br.com.projetodb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.projetodb.modelo.Endereco;
import br.com.projetodb.modelo.Pessoa;

@Stateless
public class dadoDao {

	@PersistenceContext
	private EntityManager manager;

	public void salvarPessoa(Pessoa p) {
		manager.persist(p);
	} 

	public void salvarEndereco(Endereco e) {
		manager.persist(e);
	}

	
	public void removePesssoa(Pessoa p) {
		Pessoa pApagar = manager.merge(p);
		manager.remove(pApagar);
	}
	
	public Pessoa listarPorId(Long id) {
		 Pessoa p = manager.find(Pessoa.class, id);
		return p ;

	}
	
	public List<Pessoa> listar() {
		String jpql = "select p from Pessoa p";
	//+ " join fetch p.end";

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
