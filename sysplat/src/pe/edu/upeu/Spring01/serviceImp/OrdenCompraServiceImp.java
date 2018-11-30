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
	private OrdenCompraDaoImp ordencompra;
	

	@Override
	public OrdenCompra buscarOrdenCompra(int ord) {
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
		return (Integer) null	;
	}

	@Override
	public List<Map<String, Object>> traerproductos(int idCompra) {
		// TODO Auto-generated method stub
		return ordencompra.listarproductos(idCompra);
	}

	@Override
	public int crearOrdenCompra(OrdenCompra crearorden) {
		// TODO Auto-generated method stub
		return ordencompra.crearOrdenCompra(crearorden);
	}

	@Override
	public int create() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public OrdenCompra read(int key) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
