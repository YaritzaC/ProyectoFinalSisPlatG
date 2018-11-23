package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.HojaContrato;

public interface HojaContratoDao {
	public int crearHojaContrato(HojaContrato hoja) throws SQLException;
	public List<Map<String, Object>> hojaContrato(int codigopedido);
}
