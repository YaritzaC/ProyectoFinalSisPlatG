package pe.edu.upeu.Spring01.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.Pedido;

public interface PedidoService {
	public List<Map<String, Object>> readAll();
	public int crearPedido(Pedido pedido);
}
