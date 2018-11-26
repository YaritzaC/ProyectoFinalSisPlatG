package pe.edu.upeu.Spring01.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.MateriaOrden;
import pe.edu.upeu.Spring01.entity.OrdenTrabajo;

public interface OrdenTrabajoService {
	 public List<Map<String,Object>> ordenTrabajo(int codigopedido);
	 public List<Map<String, Object>> listar_orden_trabajo();
	 public List<Map<String, Object>> listar_materia_prima();
     public int crearOrdenTrabajo (OrdenTrabajo orden);
     public int crearMateriaOrden (MateriaOrden materia);
}
