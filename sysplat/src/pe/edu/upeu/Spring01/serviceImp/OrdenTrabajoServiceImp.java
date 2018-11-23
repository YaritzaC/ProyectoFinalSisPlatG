package pe.edu.upeu.Spring01.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.OrdenTrabajoDaoImp;
import pe.edu.upeu.Spring01.service.OrdenTrabajoService;

@Service
public class OrdenTrabajoServiceImp implements OrdenTrabajoService{
	@Autowired
    private OrdenTrabajoDaoImp orden;
	@Override
	public List<Map<String, Object>> ordenTrabajo(int codigopedido) {
		return orden.ordenTrabajo(codigopedido);
	}
	@Override
	public List<Map<String, Object>> listar_orden_trabajo() {
		return orden.listar_orden_trabajo();
	}

}
