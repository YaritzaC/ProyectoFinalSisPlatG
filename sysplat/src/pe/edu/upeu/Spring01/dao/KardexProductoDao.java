package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;

import pe.edu.upeu.Spring01.entity.KardexProducto;

public interface KardexProductoDao {
	public int crearKardexProducto(KardexProducto kardexproducto) throws SQLException;
}
