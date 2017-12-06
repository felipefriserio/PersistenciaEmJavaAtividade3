package fiap.persistencia.atividade.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Cliente")
public class Cliente implements Serializable {
	
	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	@Column(name="idCliente")
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	public Cliente() {}
	public Cliente(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	public Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	 
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "idCliente : "+this.id+
				" nome: "+ this.nome+
				" email: "+this.email;
	}
	
	
	
}
