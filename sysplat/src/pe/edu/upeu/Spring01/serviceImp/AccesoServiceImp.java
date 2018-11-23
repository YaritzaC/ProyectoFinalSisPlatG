package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.Spring01.daoImp.AccesoDaoImp;
import pe.edu.upeu.Spring01.entity.Acceso;
import pe.edu.upeu.Spring01.service.AccesoService;

@Service
public class AccesoServiceImp implements AccesoService{

	
	@Autowired
	private AccesoDaoImp acs;

	@Override
	public int create(Acceso a) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Acceso a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Acceso read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll(String user, String password) {
		return acs.readAll(user, password);
	}

	@Override
	public Acceso subAccesos(int idacceso) {
		// TODO Auto-generated method stub
		return acs.subAccesos(idacceso);
	}
	

}
