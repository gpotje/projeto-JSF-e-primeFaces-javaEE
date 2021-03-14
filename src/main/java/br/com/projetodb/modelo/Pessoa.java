package br.com.projetodb.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPessoa;

	private String name;
	private Integer numeroTelefone;
	private String email;

	@OneToMany(mappedBy = "pessoa",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	List<Endereco> end = new ArrayList<>();
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String name, Integer numeroTelefone, String email) {
		super();
		this.name = name;
		this.numeroTelefone = numeroTelefone;
		this.email = email;
	}

	public Long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Endereco> getEnd() {
		return end;
	}

	public void setEnd(List<Endereco> end) {
		this.end = end;
	}

	public Integer getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(Integer numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", name=" + name + ", numeroTelefone=" + numeroTelefone + ", email="
				+ email + ", end=" + end + "]";
	}
	
	

}
