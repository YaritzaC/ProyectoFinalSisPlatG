package pe.edu.upeu.Spring01.daoImp;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.Spring01.entity.OrdenCompra;
import pe.edu.upeu.Spring01.entity.OrdenTrabajo;

public class OrdenCompraRowMapper implements RowMapper<OrdenCompra>{

	@Override
	public OrdenCompra mapRow(ResultSet rs, int arg1) throws SQLException {
		
		OrdenCompra ord = new OrdenCompra();
		ord.setIdordencompra(rs.getInt("ORDCOM_ID"));
		ord.setIdempleado (rs.getInt("EMPL_ID"));
		ord.setIdproveedor(rs.getInt("PROVE_ID"));
		ord.setCodigo(rs.getString("ORDCOM_CODIGO"));
		ord.setTipo(rs.getString("ORDCOM_TIPO"));
		ord.setFecha(rs.getString("ORDCOM_FECHA"));
		ord.setEstado(rs.getString("ORDCOM_ESTADO"));
		
		return ord;
	}

}
