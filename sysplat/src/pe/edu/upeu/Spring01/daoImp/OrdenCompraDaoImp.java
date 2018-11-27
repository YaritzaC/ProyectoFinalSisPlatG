package pe.edu.upeu.Spring01.daoImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.OrdenCompraDao;
import pe.edu.upeu.Spring01.entity.OrdenCompra;

@Repository
public class OrdenCompraDaoImp implements OrdenCompraDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public List<Map<String, Object>>readAll() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForList("{ call com_listar_detalle() }");
	}

	@Override
	public int update(OrdenCompra ordencompra) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("{ call com_actualizar_orden_compra("+ordencompra.getIdordencompra() +") }");
	}

	@Override
	public OrdenCompra buscarOrdenCompra(String p) {
		// TODO Auto-generated method stub
		return null;
	}



}