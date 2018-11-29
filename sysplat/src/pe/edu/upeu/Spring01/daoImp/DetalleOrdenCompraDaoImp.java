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
import pe.edu.upeu.Spring01.entity.Cliente;
import pe.edu.upeu.Spring01.entity.Compra;
import pe.edu.upeu.Spring01.entity.DetalleOrdenCompra;

@Repository
public class DetalleOrdenCompraDaoImp implements DetalleOrdenCompraDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int create(DetalleOrdenCompra detalleordcom) throws SQLException {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("{call com_agregar_detalle_compra(?,?,?,?)}",detalleordcom.getIdproducto(),detalleordcom.getCantidad(),detalleordcom.getIdMTP(),detalleordcom.getPrecio());
	}

	@Override
	public int update(DetalleOrdenCompra detalleordcom) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DetalleOrdenCompraDao read(int compras) {
		// TODO Auto-generated method stub
		String sql = "{ com_listar_productos_orden(?) }";
		DetalleOrdenCompra doc = jdbcTemplate.queryForObject(sql, new DetalleOrdenCompraRowMapper(), compras);
		return (DetalleOrdenCompraDao) doc;		
	}

	@Override
	public List<Map<String, Object>> listarordencompra() {
		// TODO Auto-generated method stub
		//return this.jdbcTemplate.queryForList("{call com_listar_detalle()}");
		return this.jdbcTemplate.queryForList("{call com_listar_detalle()}");
	}

	

}