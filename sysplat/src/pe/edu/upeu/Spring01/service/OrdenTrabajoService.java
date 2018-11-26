package pe.edu.upeu.Spring01.service;

import java.util.List;
import java.util.Map;

public interface OrdenTrabajoService {
	 public List<Map<String,Object>> ordenTrabajo(int codigopedido);
	 public List<Map<String, Object>> listar_orden_trabajo();
	 public List<Map<String, Object>> listar_materia_prima();
}
