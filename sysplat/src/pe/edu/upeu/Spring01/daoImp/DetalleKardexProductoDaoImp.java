package pe.edu.upeu.Spring01.daoImp;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.DetalleKardexProductoDao;
import pe.edu.upeu.Spring01.entity.DetalleKardexProducto;

@Repository
public class DetalleKardexProductoDaoImp implements DetalleKardexProductoDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int crearDetalleKardexProducto(DetalleKardexProducto detallekardex) throws SQLException {
		// TODO Auto-generated method stub
		String sql = null;
		try {
			sql="{ call ven_crear_detallekardexproducto(?,?,?)}";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return jdbcTemplate.update(sql, detallekardex.getIdproducto(), detallekardex.getPrecio(), detallekardex.getCantidad());
	}

}
