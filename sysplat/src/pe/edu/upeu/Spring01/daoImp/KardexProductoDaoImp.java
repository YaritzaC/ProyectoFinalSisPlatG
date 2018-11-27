package pe.edu.upeu.Spring01.daoImp;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.KardexProductoDao;
import pe.edu.upeu.Spring01.entity.KardexProducto;

@Repository
public class KardexProductoDaoImp implements KardexProductoDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int crearKardexProducto(KardexProducto kardexproducto) throws SQLException {
		// TODO Auto-generated method stub
		String sql = null;
		try {
			sql="{ call ven_crear_kardex_producto(?,?)}";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return jdbcTemplate.update(sql, kardexproducto.getIdsede(),
				                        kardexproducto.getConcepto());
	}

}
