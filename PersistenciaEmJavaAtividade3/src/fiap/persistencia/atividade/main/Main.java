package fiap.persistencia.atividade.main;

import java.util.Calendar;
import java.util.List;

import fiap.persistencia.atividade.dao.GenericDao;
import fiap.persistencia.atividade.model.Cliente;
import fiap.persistencia.atividade.model.Pedido;

public class Main {
	public static void main(String[] args) {
		
		// ************ Testa Cliente ************
		GenericDao clienteDao = new GenericDao(Cliente.class);
		Cliente c = new Cliente("cliente 1", "email1");
		
		// inclui e retorna cliente com ID preenchido
		c = (Cliente) clienteDao.adicionar(c);
		
		// atualiza nome do cliente e busca 
		c.setNome("nome foi alterado");
		clienteDao.atualizar(c);
		c = (Cliente) clienteDao.buscar(c.getId());
		
		// testa lista de clientes
		List<Cliente> listaDeClientes = clienteDao.listar();
		for (Cliente cliente : listaDeClientes) {
			cliente.toString();
		}
		
		// deleta do banco  
		clienteDao.remover(c);
		
		// ************ Testa Pedido ************
		GenericDao pedidoDao = new GenericDao(Pedido.class);
		Cliente c2 = new Cliente("cliente 2", "email2");
		c2 = (Cliente) clienteDao.adicionar(c2);
		
		Pedido p = new Pedido(c2, Calendar.getInstance(), "descricao1", 10d);
		// inclui e retorna cliente com ID preenchido
		p = (Pedido) pedidoDao.adicionar(p);
		
		// atualiza nome do cliente e busca 
		p.setDescricao("descricao alterada");
		pedidoDao.atualizar(p);
		p = (Pedido) pedidoDao.buscar(p.getId());
		
		// testa lista de clientes
		List<Pedido> listaDePedidos = pedidoDao.listar();
		for (Pedido pedido : listaDePedidos) {
			pedido.toString();
		}
		
		// deleta do banco  
		//pedidoDao.remover(p);
	}
}
