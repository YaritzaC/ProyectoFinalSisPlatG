package pe.edu.upeu.Spring01.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.Cliente;

public interface ClienteService {
	 public Cliente buscarCliente(String c);
	 public List<Map<String, Object>> readAll();
}
