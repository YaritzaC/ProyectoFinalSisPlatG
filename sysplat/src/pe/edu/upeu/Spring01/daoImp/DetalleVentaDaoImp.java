package pe.edu.upeu.Spring01.daoImp;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.dao.DetalleVentaDao;
import pe.edu.upeu.Spring01.entity.DetalleVenta;
@Service
public class DetalleVentaDaoImp implements DetalleVentaDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int crearDetallePedido(DetalleVenta detalle) throws SQLException {
		String sql = null;
		try {
			sql="{ call ven_crear_detalle_venta_pedido(?,?)}";
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
		return jdbcTemplate.update(sql, detalle.getPrecio(),detalle.getCantidad());
	}

	@Override
	public int crearDetalleVenta(DetalleVenta detalle) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}
