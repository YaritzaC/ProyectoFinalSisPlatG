package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.OrdenCompra;


public interface OrdenCompraDao {
 public int create(OrdenCompra ordencompra)throws SQLException;
 public int update(OrdenCompra ordencompra);
 public int delete(int id);
 public OrdenCompra read(int id);
 public List<Map<String, Object>>readAll();
}
