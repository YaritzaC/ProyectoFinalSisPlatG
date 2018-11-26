package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.MateriaPrimaDaoImp;
import pe.edu.upeu.Spring01.entity.MateriaPrima;
import pe.edu.upeu.Spring01.service.MateriaPrimaService;

@Service
public class MateriaPrimaServiceImp implements MateriaPrimaService{
	@Autowired
    private MateriaPrimaDaoImp materia;
	
	
	@Override
	public int create(MateriaPrima materiaprima) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MateriaPrima materiaprima) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MateriaPrima read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MateriaPrima> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MateriaPrima buscarMateriaPrima(String p) {
		return materia.buscarMateriaPrima(p);
	}

}
