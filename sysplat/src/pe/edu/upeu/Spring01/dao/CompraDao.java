package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.entity.Compra;


public interface CompraDao {
 public int create(Compra compra)throws SQLException;
 public int update(Compra compra);
 public int delete(int id);
 public Compra read(String id);
 public List<Compra> readAll();
} 
