package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.Acceso;

public interface AccesoDao {
	public int create(Acceso a)throws SQLException;
	 public int update(Acceso a);
	 public int delete(int id);
	 public Acceso read(int id);
	 public List<Map<String,Object>> readAll(String user, String password);
	 public Acceso subAccesos (int idacceso);
}
