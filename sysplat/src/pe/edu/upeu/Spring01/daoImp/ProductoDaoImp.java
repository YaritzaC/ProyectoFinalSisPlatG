package pe.edu.upeu.Spring01.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.ProductoDao;
import pe.edu.upeu.Spring01.entity.Producto;
@Repository
public class ProductoDaoImp implements ProductoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public Producto buscarProducto(String p) {
		Producto pro = new Producto();
		try {
			String sql = "{ call ven_buscar_codigo_producto(?) }";
			pro = jdbcTemplate.queryForObject(sql, new ProductoRowMapper(), p);
		} catch (Exception e) {
			System.out.println("Error fatal" + e);
		}
		return pro;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForList("{call com_listar_productos()}");
	}

}
