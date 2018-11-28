package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.DetalleOrdenCompraDaoImp;
import pe.edu.upeu.Spring01.daoImp.OrdenCompraDaoImp;
import pe.edu.upeu.Spring01.daoImp.ProductoDaoImp;
import pe.edu.upeu.Spring01.entity.OrdenCompra;
import pe.edu.upeu.Spring01.entity.Producto;
import pe.edu.upeu.Spring01.service.DetalleOrdenCompraService;
import pe.edu.upeu.Spring01.service.OrdenCompraService;
import pe.edu.upeu.Spring01.service.ProductoService;
@Service
public class OrdenCompraServiceImp implements OrdenCompraService{
	@Autowired
	private OrdenCompraDaoImp pro;
	

	@Override
	public OrdenCompra buscarOrdenCompra(String ord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(OrdenCompra ordencompra) {
		// TODO Auto-generated method stub
		return pro.update(ordencompra);
	}

	@Override
	public List<Map<String, Object>> traerproductos(OrdenCompra orden) {
		// TODO Auto-generated method stub
		return pro.listarproductos(orden);
	}
	

}
