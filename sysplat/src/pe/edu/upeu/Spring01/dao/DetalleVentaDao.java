package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;

import pe.edu.upeu.Spring01.entity.DetalleVenta;

public interface DetalleVentaDao {
	public int crearDetallePedido(DetalleVenta detalle) throws SQLException;
	public int crearDetalleVenta(DetalleVenta detalle) throws SQLException;
}
