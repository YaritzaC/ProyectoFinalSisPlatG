package pe.edu.upeu.Spring01.daoImp;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.Spring01.entity.OrdenTrabajo;

public class OrdenCompraRowMapper implements RowMapper<OrdenTrabajo>{

	@Override
	public OrdenTrabajo mapRow(ResultSet rs, int arg1) throws SQLException {
	
		return null;
	}

}
