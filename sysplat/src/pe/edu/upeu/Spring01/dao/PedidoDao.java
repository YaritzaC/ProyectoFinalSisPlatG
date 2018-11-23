package pe.edu.upeu.Spring01.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.Pedido;

public interface PedidoDao {
	public List<Map<String, Object>> readAll();
	public int crearPedido(Pedido pedido);
}
