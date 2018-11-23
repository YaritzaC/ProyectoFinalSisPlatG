package pe.edu.upeu.Spring01.daoImp;


import pe.edu.upeu.Spring01.entity.Acceso;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AccesoRowMapper implements RowMapper<Acceso>{

	@Override
	public Acceso mapRow(ResultSet rs, int id) throws SQLException {
		Acceso a = new Acceso();
		a.setIdhijo(rs.getInt("ACS_HIJO"));
		a.setNombre((rs.getString("ACS_NOMBRE")));
		a.setIcono(rs.getString("ACS_ICONO"));
		a.setUrl(rs.getString("ACS_URL"));
		return a;
	}

}
