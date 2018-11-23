package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.Empleado;

public interface EmpleadoService {
 public int create(Empleado empleado)throws SQLException;
 public int update(Empleado empleado);
 public int delete(int id);
 public Empleado read(int id);
 public List<Empleado> readAll();
 List<Map<String,Object>> validarEmpleado (Empleado e);
}
