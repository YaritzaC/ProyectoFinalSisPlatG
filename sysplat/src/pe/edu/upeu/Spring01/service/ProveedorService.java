package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.entity.Proveedor;


public interface ProveedorService {
 public int create(Proveedor proveedor)throws SQLException;
 public int update(Proveedor proveedor);
 public int delete(int id);
 public Proveedor read(int id);
 public List<Proveedor> readAll();
}
