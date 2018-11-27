package pe.edu.upeu.Spring01.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.Producto;

public interface ProductoDao {
	public Producto buscarProducto(String p);
	public List<Map<String, Object>> readAll();
	public List<Map<String, Object>> readAllMenor();
}
