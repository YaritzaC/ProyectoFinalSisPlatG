package pe.edu.upeu.Spring01.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.edu.upeu.Spring01.entity.MateriaPrima;


public class MateriaPrimaRowMapper implements RowMapper<MateriaPrima>{

	@Override
	public MateriaPrima mapRow(ResultSet rs, int arg1) throws SQLException {
		MateriaPrima materia = new MateriaPrima();
		materia.setIdmatpri(rs.getInt("MTP_ID"));
		materia.setNombre(rs.getString("MTP_NOMBRE"));
		materia.setStock(rs.getDouble("MTP_STOCK"));
		materia.setEstado(rs.getString("MTP_ESTADO"));
		return materia;
	}

}
