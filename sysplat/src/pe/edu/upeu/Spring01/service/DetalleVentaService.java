package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;

import pe.edu.upeu.Spring01.entity.DetalleVenta;

public interface DetalleVentaService {
	public int crearDetallePedido(DetalleVenta detalle) throws SQLException;
}
