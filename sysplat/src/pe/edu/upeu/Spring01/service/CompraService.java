package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.Acceso;
import pe.edu.upeu.Spring01.entity.Compra;


public interface CompraService {
	public int create(Compra c)throws SQLException;
	 public int update(Compra c);
	 public int delete(int id);
	 public Compra read(int compra);
	 public List<Map<String,Object>> readAll();
}
