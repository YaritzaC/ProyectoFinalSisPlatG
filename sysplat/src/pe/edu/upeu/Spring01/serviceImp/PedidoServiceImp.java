package pe.edu.upeu.Spring01.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.PedidoDaoImp;
import pe.edu.upeu.Spring01.entity.Pedido;
import pe.edu.upeu.Spring01.service.PedidoService;

@Service
public class PedidoServiceImp implements PedidoService {
	@Autowired
	private PedidoDaoImp pe;

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return pe.readAll();
	}

	@Override
	public int crearPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return pe.crearPedido(pedido);
	}
}
