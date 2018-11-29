package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.DetalleOrdenCompra;


public interface DetalleOrdenCompraService {
	public int create(DetalleOrdenCompra detalleordcom) throws SQLException;
	public int update(DetalleOrdenCompra detalleordcom);
	public int delete(int id);
	public DetalleOrdenCompra read(int id);
	public List<Map<String, Object>> listarordencompra();
	public List<Map<String, Object>> listarproductos(int ID);

}
