package pe.edu.upeu.Spring01.daoImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.OrdenTrabajoDao;
import pe.edu.upeu.Spring01.entity.OrdenTrabajo;

@Repository
public class OrdenTrabajoDaoImp implements OrdenTrabajoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Map<String, Object>> ordenTrabajo(int codigopedido) {
		String sql=null;
		try {
		 sql="SELECT C.CLI_NOMBRE, P.PED_CODIGO, P.PED_NOMBRE, P.PED_FECHA, E.EMPL_ID  FROM \n" + 
					"PEDIDO AS P, EMPLEADO AS E, CLIENTE AS C WHERE P.PED_CODIGO='"+codigopedido+"' "
							+ "and E.EMPL_ID=P.EMPL_ID AND C.CLI_ID=P.CLI_ID;";
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public int create(OrdenTrabajo codigopedido) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
