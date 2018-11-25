package pe.edu.upeu.Spring01.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.Cliente;

public interface ClienteDao {
	 public Cliente buscarCliente(String c);
	 public List<Map<String, Object>> readAll();
}
