package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.ProductoDaoImp;
import pe.edu.upeu.Spring01.entity.Compra;
import pe.edu.upeu.Spring01.entity.Producto;
import pe.edu.upeu.Spring01.entity.Proveedor;
import pe.edu.upeu.Spring01.service.CompraService;
import pe.edu.upeu.Spring01.service.ProductoService;
import pe.edu.upeu.Spring01.service.ProveedorService;
@Service
public class ProveedorServiceImp implements ProveedorService {
	

	@Override
	public int create(Proveedor proveedor) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Proveedor read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proveedor> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
