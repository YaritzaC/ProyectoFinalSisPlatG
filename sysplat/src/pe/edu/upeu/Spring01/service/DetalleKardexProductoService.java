package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.entity.DetalleKardexProducto;

public interface DetalleKardexProductoService {
	public int create(DetalleKardexProducto detallekarpro) throws SQLException;

	public int update(DetalleKardexProducto detallekarpro);

	public int delete(int id);

	public DetalleKardexProducto read(int id);

	public List<DetalleKardexProducto> readAll();
}
