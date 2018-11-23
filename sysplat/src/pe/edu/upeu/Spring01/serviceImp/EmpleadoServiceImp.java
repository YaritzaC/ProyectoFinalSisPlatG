package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.EmpleadoDaoImp;
import pe.edu.upeu.Spring01.entity.Empleado;
import pe.edu.upeu.Spring01.service.EmpleadoService;
@Service
public class EmpleadoServiceImp implements EmpleadoService {
@Autowired
private EmpleadoDaoImp emple;
	@Override
	public int create(Empleado empleado) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Empleado empleado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Empleado read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> validarEmpleado(Empleado e) {
		// TODO Auto-generated method stub
		return emple.validarEmpleado(e);
	}


}
