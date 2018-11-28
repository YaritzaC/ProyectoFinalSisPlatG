package pe.edu.upeu.Spring01.daoImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.HojaContratoDao;
import pe.edu.upeu.Spring01.entity.HojaContrato;
@Repository
public class HojaContratoDaoImp implements HojaContratoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Map<String, Object>> hojaContrato(int codigopedido) {
		String sql = null;
		try {
			sql = "SELECT C.CLI_NOMBRE,P.PED_ID, P.PED_CODIGO, P.PED_NOMBRE, P.PED_FECHA, E.EMPL_ID , P.PED_CANTIDAD,P.PED_PRECIO FROM  PEDIDO AS P, EMPLEADO AS E, CLIENTE AS C \n" + 
             		"WHERE P.PED_CODIGO='"+codigopedido+ "'and E.EMPL_ID=P.EMPL_ID AND  C.CLI_ID=P.CLI_ID;";
		} catch (Exception e) {
		System.out.println("Error" + e);
		}
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public int crearHojaContrato(HojaContrato hoja) throws SQLException {
		String sql = null;
		try {
			sql="{ call ped_crear_hoja_contrato(?,?,?,?)}";
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
		return jdbcTemplate.update(sql, hoja.getIdempleado(),hoja.getIdpedido(),hoja.getTotal(),hoja.getAdelanto());
	}

	@Override
	public List<Map<String, Object>> listar_hoja_contrato() {
		return this.jdbcTemplate.queryForList("{ call ped_listar_hoja_contrato()}");
	}

	

	

}
