package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;

import pe.edu.upeu.Spring01.entity.DetalleKardexProducto;

public interface DetalleKardexProductoDao {
	
	// Crear detalle kardex producto
	public int crearDetalleKardexProducto(DetalleKardexProducto detallekardex) throws SQLException;
}
