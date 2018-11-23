package pe.edu.upeu.Spring01.daoImp;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.Spring01.entity.DetalleVenta;

public class DetalleVentaRowMapper implements RowMapper<DetalleVenta>{

	@Override
	public DetalleVenta mapRow(ResultSet rs, int arg1) throws SQLException {
		DetalleVenta detalle = new DetalleVenta();
		detalle.setDetalleventaid(rs.getInt("DTVN_ID"));
		detalle.setVentaid(rs.getInt("VNT_ID"));
		detalle.setProductoid(rs.getInt("PRO_ID"));
		detalle.setPrecio(rs.getDouble("DTVN_PRECIO"));
		detalle.setCantidad(rs.getInt("DTVN_CANTIDAD"));
		detalle.setImporte(rs.getDouble("DTVN_IMPORTE"));
		detalle.setEstado(rs.getString("DTVN_ESTADO"));
		return detalle;
	}

}
