package pe.edu.upeu.Spring01.daoImp;


import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.EmpleadoDao;
import pe.edu.upeu.Spring01.entity.Empleado;
@Repository
public class EmpleadoDaoImp implements EmpleadoDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Empleado empleado) throws SQLException {

		return 0;
	}

	@Override
	public int update(Empleado empleado) {
		
		return 0;
	}

	@Override
	public int delete(int id) {
		
		return 0;
	}

	@Override
	public Empleado read(int id) {
		
		return null;
	}

	@Override
	public List<Empleado> readAll() {
		
		return null;
	}

	@Override
	public List<Map<String, Object>> validarEmpleado(Empleado e) {
		String sql= "SELECT a.ACS_ID,e.EMPL_USER,e.EMPL_ID, s.SED_ID, e.EMPL_PASSWORD, a.ACS_ICONO,e.EMPL_NOMBRE"
				+ ", e.EMPL_APELLIDO, e.EMPL_TIPO, a.ACS_NOMBRE,"
				+ " a.ACS_URL, s.SED_NOMBRE sede FROM empleado as e,empleado_acceso as ea,acceso as a, sede as s "
		+ " WHERE EMPL_USER='"+e.getUser()+"' and \n" +"EMPL_PASSWORD='"+e.getPassword()+"' and EMPL_ESTADO='Activo' and e.EMPL_ID=ea.EMPL_ID "
		+ "AND ea.ACS_ID=a.ACS_ID AND s.SED_ID='"+e.getIdsede()+"'\n" + "AND e.SED_ID=s.SED_ID and s.SED_ESTADO='Activo';";
		return jdbcTemplate.queryForList(sql);
	}
	
}












