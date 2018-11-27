package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;

import pe.edu.upeu.Spring01.entity.DetalleKardexProducto;

public interface DetalleKardexProductoService {

	// Crear detalle kardex producto
	public int crearDetalleKardexProducto(DetalleKardexProducto detallekardex) throws SQLException;
}
