package pe.edu.upeu.Spring01.daoImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.ClienteDao;
import pe.edu.upeu.Spring01.dao.CompraDao;
import pe.edu.upeu.Spring01.dao.DetalleOrdenCompraDao;
import pe.edu.upeu.Spring01.dao.MateriaOrdenDao;
import pe.edu.upeu.Spring01.dao.MateriaPrimaDao;
import pe.edu.upeu.Spring01.dao.OrdenCompraDao;
import pe.edu.upeu.Spring01.entity.Cliente;
import pe.edu.upeu.Spring01.entity.Compra;
import pe.edu.upeu.Spring01.entity.MateriaOrden;
import pe.edu.upeu.Spring01.entity.MateriaPrima;
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
	public int create(OrdenCompra ordencompra) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(OrdenCompra ordencompra) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public OrdenCompra read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>>readAll() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForList("{ call com_listar_orden_compra() }");
	}



}