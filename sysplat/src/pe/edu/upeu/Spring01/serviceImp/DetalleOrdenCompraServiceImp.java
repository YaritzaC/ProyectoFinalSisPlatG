package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.DetalleOrdenCompraDaoImp;
import pe.edu.upeu.Spring01.daoImp.OrdenCompraDaoImp;
import pe.edu.upeu.Spring01.daoImp.ProductoDaoImp;
import pe.edu.upeu.Spring01.entity.Producto;
import pe.edu.upeu.Spring01.service.DetalleOrdenCompraService;
import pe.edu.upeu.Spring01.service.ProductoService;
@Service
public class DetalleOrdenCompraServiceImp implements DetalleOrdenCompraService{
	@Autowired
	private OrdenCompraDaoImp pro;
	

	@Override
	public int create(DetalleOrdenCompraService detalleordcom) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DetalleOrdenCompraService detalleordcom) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DetalleOrdenCompraService read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return pro.readAll();
	}

}
