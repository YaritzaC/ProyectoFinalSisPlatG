package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.OrdenCompra;
import pe.edu.upeu.Spring01.entity.Producto;


public interface OrdenCompraDao {
public OrdenCompra buscarOrdenCompra(String p);
 public int update(OrdenCompra ordencompra);
 public List<Map<String, Object>>readAll();
 public List<Map<String, Object>> listarproductos(OrdenCompra ordenid);
}
