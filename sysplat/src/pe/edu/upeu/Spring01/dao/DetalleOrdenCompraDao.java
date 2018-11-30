package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.DetalleOrdenCompra;
import pe.edu.upeu.Spring01.entity.Producto;


public interface DetalleOrdenCompraDao {
	public int create(DetalleOrdenCompra detalleordcom) throws SQLException;
	public int update(DetalleOrdenCompra detalleordcom);
	public int delete(int id);
	public DetalleOrdenCompraDao read(int compras);
	public Producto detalle(int key);
	public List<Map<String, Object>> buscarProducto(int compras);
	public List<Map<String, Object>> listarordencompra();

}
