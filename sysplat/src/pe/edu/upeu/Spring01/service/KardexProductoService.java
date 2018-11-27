package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;

import pe.edu.upeu.Spring01.entity.KardexProducto;

public interface KardexProductoService {
	public int crearKardexProducto(KardexProducto kardexproducto) throws SQLException;
}
