package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.daoImp.DetalleDaoImp;
import pe.edu.upeu.Spring01.entity.DetalleVenta;
import pe.edu.upeu.Spring01.service.DetalleVentaService;
@Repository
public class DetalleDaoServiceImp implements DetalleVentaService {
	@Autowired
	private DetalleDaoImp detalleVenta;

	@Override
	public int crearDetallePedido(DetalleVenta detalle) throws SQLException {
		return detalleVenta.crearDetallePedido(detalle);
	}

	
}
