package pe.edu.upeu.Spring01.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.Spring01.entity.Producto;

public class ProductoRowMapper implements RowMapper<Producto>{

	@Override
	public Producto mapRow(ResultSet rs, int RowNum) throws SQLException {
		Producto p = new Producto();
		p.setIdproducto(rs.getInt("PRO_ID"));
		p.setNombre(rs.getString("PRO_NOMBRE"));
		p.setPrecio(rs.getDouble("PRO_PRECIO"));
		p.setStock(rs.getInt("PRO_STOCK"));
		p.setCodigo(rs.getString("PRO_CODIGO"));
		p.setEstado(rs.getString("PRO_ESTADO"));
		return p;
	}

}
