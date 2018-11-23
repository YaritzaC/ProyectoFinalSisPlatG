package pe.edu.upeu.Spring01.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.Spring01.entity.HojaContrato;

public class HojaContratoRowMapper implements RowMapper<HojaContrato>{

	@Override
	public HojaContrato mapRow(ResultSet rs, int abc) throws SQLException {
		HojaContrato hoja = new HojaContrato();
		hoja.setIdhojacontrato(rs.getInt("HCT_ID"));
		hoja.setIdempleado(rs.getInt("EMPL_ID"));
		hoja.setIdpedido(rs.getInt("PED_ID"));
		hoja.setFecha(rs.getString("HCT_FECHA"));
		hoja.setCodigo(rs.getString("HCT_CODIGO"));
		hoja.setTotal(rs.getDouble("HCT_TOTAL"));
		hoja.setMitad_total(rs.getDouble("HCT_MITADTOTAL"));
		hoja.setEstado(rs.getString("HCT_ESTADO"));
		return hoja;
	}

}
