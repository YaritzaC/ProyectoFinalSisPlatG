package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.ClienteDaoImp;
import pe.edu.upeu.Spring01.daoImp.CompraDaoImp;
import pe.edu.upeu.Spring01.daoImp.ProductoDaoImp;
import pe.edu.upeu.Spring01.entity.Compra;
import pe.edu.upeu.Spring01.entity.Producto;
import pe.edu.upeu.Spring01.service.CompraService;
import pe.edu.upeu.Spring01.service.ProductoService;
@Service
public class CompraServiceImp implements CompraService {
	
	@Autowired
    private CompraDaoImp comp;

	@Override
	public int create(Compra c) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Compra c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Compra read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		
		// TODO Auto-generated method stub
		return null;
	}


}
