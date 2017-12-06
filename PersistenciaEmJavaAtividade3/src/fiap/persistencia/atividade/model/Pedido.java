package fiap.persistencia.atividade.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table(name="Pedido")
public class Pedido implements Serializable {
	
	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	@Column(name="idPedido")
	private Integer id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCliente")
	private Cliente cliente;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	private Calendar dataPedido;
	
	private String descricao;
	private double valor;
	
	
	public Pedido() {}
	public Pedido(Cliente cliente, Calendar dataPedido, String descricao, double valor) {
		this.cliente = cliente;
		this.dataPedido = dataPedido;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Calendar getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Calendar dataPedido) {
		this.dataPedido = dataPedido;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "id: " + this.id+
			   " cliente: "+ cliente.toString()+
			   " dataPedido: "+ this.dataPedido+
			   " descricao: "+ this.descricao+
			   " valor" + this.valor;
	}
	
	

}
