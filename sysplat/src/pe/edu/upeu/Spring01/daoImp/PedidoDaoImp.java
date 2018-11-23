package pe.edu.upeu.Spring01.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.PedidoDao;
import pe.edu.upeu.Spring01.entity.Pedido;

@Repository
public class PedidoDaoImp implements PedidoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForList("{ call ped_listar_pedidos() }");
	}

	@Override
	public int crearPedido(Pedido pedido) {
		String sql = null;
		try {
			sql="{ call ped_crear_pedido(?,?,?,?,?,?,?,?,?)}";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return jdbcTemplate.update(sql, pedido.getIdempleado(), pedido.getIdsede(), pedido.getIdcliente(), 
				pedido.getNombre(), pedido.getCantidad(),
				pedido.getPrecio(), pedido.getDimension(), pedido.getEspecificacion(), pedido.getObservacion());
	
	}

}
