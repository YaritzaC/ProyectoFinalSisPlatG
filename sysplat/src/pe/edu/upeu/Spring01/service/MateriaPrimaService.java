package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.entity.MateriaPrima;


public interface MateriaPrimaService {
 public int create(MateriaPrima materiaprima)throws SQLException;
 public int update(MateriaPrima materiaprima);
 public int delete(int id);
 public MateriaPrima read(int id);
 public List<MateriaPrima> readAll();
 public MateriaPrima buscarMateriaPrima(String p);
}
