//package br.com.projetodb.modelo;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//
//@Entity
//public class Funcionario implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long idFuncionario;
//
//	private String name;
//	private Integer NumeroTelefone;
//	private String Email;
//	private String matricula;
//	private BigDecimal salario;
//	private String cargo;
//	
//	public Funcionario() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Long getIdFuncionario() {
//		return idFuncionario;
//	}
//
//	public void setIdFuncionario(Long idFuncionario) {
//		this.idFuncionario = idFuncionario;
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
//	public String getMatricula() {
//		return matricula;
//	}
//
//	public void setMatricula(String matricula) {
//		this.matricula = matricula;
//	}
//
//	public BigDecimal getSalario() {
//		return salario;
//	}
//
//	public void setSalario(BigDecimal salario) {
//		this.salario = salario;
//	}
//
//	public String getCargo() {
//		return cargo;
//	}
//
//	public void setCargo(String cargo) {
//		this.cargo = cargo;
//	}
//	
//	
//	
//}
