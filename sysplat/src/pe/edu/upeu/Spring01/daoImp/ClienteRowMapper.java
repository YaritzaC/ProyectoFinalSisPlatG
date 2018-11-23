package pe.edu.upeu.Spring01.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.Spring01.entity.Cliente;

public class ClienteRowMapper implements RowMapper<Cliente>{

	@Override
	public Cliente mapRow(ResultSet rs, int RowNum) throws SQLException {
		Cliente c = new Cliente();
		c.setIdcliente(rs.getInt("CLI_ID"));
		c.setRazonsocial(rs.getString("CLI_RAZONSOCIAL"));
		c.setRuc(rs.getString("CLI_RUC"));
		c.setDireccion(rs.getString("CLI_DIRECCION"));
		c.setNombre(rs.getString("CLI_NOMBRE"));
		c.setApellido(rs.getString("CLI_APELLIDO"));
		c.setDni(rs.getString("CLI_DNI"));
		c.setDni(rs.getString("CLI_CELULAR"));
		c.setCelular(rs.getString("CLI_ESTADO"));
		return c;
		
	}
	
}
