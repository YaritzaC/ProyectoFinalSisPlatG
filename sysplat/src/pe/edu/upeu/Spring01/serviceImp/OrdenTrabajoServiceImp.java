package pe.edu.upeu.Spring01.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.OrdenTrabajoDaoImp;
import pe.edu.upeu.Spring01.entity.MateriaOrden;
import pe.edu.upeu.Spring01.entity.OrdenTrabajo;
import pe.edu.upeu.Spring01.service.OrdenTrabajoService;

@Service
public class OrdenTrabajoServiceImp implements OrdenTrabajoService{
	@Autowired
    private OrdenTrabajoDaoImp ordentrabajao;
	@Override
	public List<Map<String, Object>> ordenTrabajo(int codigopedido) {
		return ordentrabajao.ordenTrabajo(codigopedido);
	}
	@Override
	public List<Map<String, Object>> listar_orden_trabajo() {
		return ordentrabajao.listar_orden_trabajo();
	}
	@Override
	public List<Map<String, Object>> listar_materia_prima() {
       return ordentrabajao.listar_materia_prima();
	}
	@Override
	public int crearOrdenTrabajo(OrdenTrabajo orden) {
		return ordentrabajao.crearOrdenTrabajo(orden);
	}
	@Override
	public int crearMateriaOrden(MateriaOrden materia) {
		return ordentrabajao.crearMateriaOrden(materia) ;
	}

}
