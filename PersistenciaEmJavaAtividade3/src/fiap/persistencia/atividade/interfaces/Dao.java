package fiap.persistencia.atividade.interfaces;

import java.util.List;

public interface Dao<T> {
	T adicionar(T entidade);
	List<T> listar();
	void atualizar(T entidade);
	void remover(T entidade);
	T buscar(int id);
}

