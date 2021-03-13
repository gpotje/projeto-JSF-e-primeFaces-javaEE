//package br.com.projetodb.modelo;
//import java.io.Serializable;
//import javax.persistence.Entity;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//
//@Entity
////@Inheritance(strategy = InheritanceType.JOINED)
//public class ClientePJ implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long idClientePJ;
//	
//	private String name;
//	private Integer NumeroTelefone;
//	private String Email;
//	private Integer cnpj;
//	private Integer razaoSocial;
//	private String inscEstadual;
//	
//	public ClientePJ() {}
//
//	public Long getIdClientePJ() {
//		return idClientePJ;
//	}
//
//	public void setIdClientePJ(Long idClientePJ) {
//		this.idClientePJ = idClientePJ;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Integer getNumeroTelefone() {
//		return NumeroTelefone;
//	}
//
//	public void setNumeroTelefone(Integer numeroTelefone) {
//		NumeroTelefone = numeroTelefone;
//	}
//
//	public String getEmail() {
//		return Email;
//	}
//
//	public void setEmail(String email) {
//		Email = email;
//	}
//
//	public Integer getCnpj() {
//		return cnpj;
//	}
//
//	public void setCnpj(Integer cnpj) {
//		this.cnpj = cnpj;
//	}
//
//	public Integer getRazaoSocial() {
//		return razaoSocial;
//	}
//
//	public void setRazaoSocial(Integer razaoSocial) {
//		this.razaoSocial = razaoSocial;
//	}
//
//	public String getInscEstadual() {
//		return inscEstadual;
//	}
//
//	public void setInscEstadual(String inscEstadual) {
//		this.inscEstadual = inscEstadual;
//	}
//	
//	
//
//
//
//}
