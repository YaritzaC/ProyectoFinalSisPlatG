package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.DetalleVentaDaoImp;
import pe.edu.upeu.Spring01.entity.DetalleVenta;
import pe.edu.upeu.Spring01.service.DetalleVentaService;
@Service
public class DetalleVentaServiceImp implements DetalleVentaService {
	@Autowired
	private DetalleVentaDaoImp detalleVenta;

	@Override
	public int crearDetallePedido(DetalleVenta detalle) throws SQLException {
		return detalleVenta.crearDetallePedido(detalle);
	}

	@Override
	public int crearDetalleVenta(DetalleVenta detalle) throws SQLException {
		// TODO Auto-generated method stub
		return detalleVenta.crearDetalleVenta(detalle);
	}

	
}
