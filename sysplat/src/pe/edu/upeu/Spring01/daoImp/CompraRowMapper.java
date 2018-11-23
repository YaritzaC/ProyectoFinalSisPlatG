package pe.edu.upeu.Spring01.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.Spring01.entity.Cliente;
import pe.edu.upeu.Spring01.entity.Compra;

public class CompraRowMapper implements RowMapper<Compra>{

	@Override
	public Compra mapRow(ResultSet rs, int RowNum) throws SQLException {
		Compra cm = new Compra();
		cm.setIdcompra(rs.getInt("CMP_ID"));
		cm.setIdproveedor(rs.getInt("PROVE_ID"));
		cm.setIdempleado(rs.getInt("EMPL_ID"));
		cm.setNumero(rs.getInt("CMP_NUMERO"));
		cm.setCantidad(rs.getInt("CMP_CANTIDAD"));
		cm.setDescuento(rs.getString("CMP_DESCUENTO"));
		cm.setSubtotal(rs.getDouble("CMP_SUBTOTAL"));
		cm.setTotal(rs.getDouble("CMP_TOTAL"));
		cm.setEstado(rs.getString("CMP_ESTADO"));
		return cm;
		
	}
	
}
