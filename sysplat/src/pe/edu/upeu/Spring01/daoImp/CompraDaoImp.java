package pe.edu.upeu.Spring01.daoImp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.ClienteDao;
import pe.edu.upeu.Spring01.dao.CompraDao;
import pe.edu.upeu.Spring01.entity.Cliente;
import pe.edu.upeu.Spring01.entity.Compra;
import pe.edu.upeu.Spring01.entity.Producto;

@Repository
public class CompraDaoImp implements CompraDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int create(Compra compra) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Compra compra) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Compra read(String id) {
		Compra comp = new Compra();
		try {
			String sql = "{ call com_buscar_compras(?) }";
			comp = jdbcTemplate.queryForObject(sql, new CompraRowMapper(), id);
		} catch (Exception e) {
			System.out.println("Error fatal" + e);
		}
		return comp;
		// TODO Auto-generated method stub
	}

	@Override
	public List<Compra> readAll() {
		// TODO Auto-generated method stub
		return null;
	}


}