package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.entity.Control;


public interface ControlService {
 public int create(Control control)throws SQLException;
 public int update(Control control);
 public int delete(int id);
 public Control read(int id);
 public List<Control> readAll();
}
