package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.MateriaOrden;


public interface MateriaOrdenDao {
 public int create(MateriaOrden materiaorden)throws SQLException;
 public int update(MateriaOrden materiaorden);
 public int delete(int id);
 public MateriaOrden read(int id);
 public List<Map<String, Object>> readAll();
}
