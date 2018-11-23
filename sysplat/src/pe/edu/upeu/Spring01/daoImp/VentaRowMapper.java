package pe.edu.upeu.Spring01.daoImp;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.Spring01.entity.Venta;
public class VentaRowMapper implements RowMapper<Venta>{

	@Override
	public Venta mapRow(ResultSet rs, int RowNum) throws SQLException {
		// TODO Auto-generated method stub
		Venta v = new Venta();
		v.setIdventa(rs.getInt("VNT_ID"));
		v.setIdempleado(rs.getInt("EMPL_ID"));
		v.setIdsede(rs.getInt("SED_ID"));
		v.setIdcliente(rs.getInt("CLI_ID"));
		v.setIdhojacontrato(rs.getInt("HCT_ID"));
		v.setFecha(rs.getString("VNT_FECHA"));
		v.setTipopago(rs.getString("VNT_TIPAGO"));
		v.setTotal(rs.getDouble("VNT_TOTAL"));
		v.setIgv(rs.getDouble("VNT_IGV"));
		v.setSubtotal(rs.getDouble("VNT_SUBTOTAL"));
		v.setTipodocumento(rs.getString("VNT_TIPDOC"));
		v.setNumero(rs.getString("VNT_NUMERO"));
		v.setSerie(rs.getString("VNT_SERIE"));
		v.setEstado(rs.getString("VNT_ESTADO"));
		return v;
	}
}
