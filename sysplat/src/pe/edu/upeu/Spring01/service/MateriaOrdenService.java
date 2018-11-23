package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.entity.MateriaOrden;


public interface MateriaOrdenService {
 public int create(MateriaOrden materiaorden)throws SQLException;
 public int update(MateriaOrden materiaorden);
 public int delete(int id);
 public MateriaOrden read(int id);
 public List<MateriaOrden> readAll();
}
