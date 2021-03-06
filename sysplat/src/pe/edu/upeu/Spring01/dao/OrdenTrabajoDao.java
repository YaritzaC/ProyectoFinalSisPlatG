package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.MateriaOrden;
import pe.edu.upeu.Spring01.entity.OrdenTrabajo;

public interface OrdenTrabajoDao {
	 public int create(OrdenTrabajo codigopedido)throws SQLException;
	 public List<Map<String,Object>> ordenTrabajo(int codigopedido);
     public List<Map<String, Object>> listar_orden_trabajo();
     public List<Map<String, Object>> listar_materia_prima();
     public int crearOrdenTrabajo (OrdenTrabajo orden);
     public int crearMateriaOrden (MateriaOrden materia);
}
