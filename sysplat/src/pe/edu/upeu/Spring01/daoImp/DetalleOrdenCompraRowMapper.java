package pe.edu.upeu.Spring01.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.Spring01.entity.DetalleOrdenCompra;

public class DetalleOrdenCompraRowMapper implements RowMapper<DetalleOrdenCompra>{

	@Override
	public DetalleOrdenCompra mapRow(ResultSet rs, int RowNum) throws SQLException {
		DetalleOrdenCompra doc = new DetalleOrdenCompra();
		
		doc.setIddtoc(rs.getInt("CMP_ID"));
		doc.setIdcompra(rs.getInt("CMP_ID"));
		doc.setIdordencompra(rs.getInt("ORDCOM_ID"));
		doc.setIdproducto(rs.getInt("PRO_ID"));
		doc.setIdMTP(rs.getInt("MTP_ID"));
		doc.setDetalle(rs.getString("DTOC_DETALLE"));
		doc.setCantidad(rs.getDouble("DTOC_CANTIDAD"));
		doc.setPrecio(rs.getDouble("DTOC_PRECIO"));
		doc.setEstado(rs.getString("CMP_ESTADO"));
		return doc;
		
	}
	
}
