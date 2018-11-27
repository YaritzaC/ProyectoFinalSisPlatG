package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.DetalleKardexProductoDaoImp;
import pe.edu.upeu.Spring01.entity.DetalleKardexProducto;
import pe.edu.upeu.Spring01.service.DetalleKardexProductoService;

@Service
public class DetalleKardexProductoServiceImp implements DetalleKardexProductoService {

	@Autowired
	private DetalleKardexProductoDaoImp detallekar;
	
	@Override
	public int crearDetalleKardexProducto(DetalleKardexProducto detallekardex) throws SQLException {
		// TODO Auto-generated method stub
		return detallekar.crearDetalleKardexProducto(detallekardex);
	}

}
