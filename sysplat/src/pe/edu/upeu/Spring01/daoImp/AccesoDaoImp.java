package pe.edu.upeu.Spring01.daoImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.AccesoDao;
import pe.edu.upeu.Spring01.entity.Acceso;
@Repository
public class AccesoDaoImp implements AccesoDao{
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Acceso a) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Acceso a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Acceso read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll(String user, String password) {
		return null;
	}

	@Override
	public Acceso subAccesos(int idacceso) {
		String sql="SELECT ACS_HIJO,ACS_NOMBRE,ACS_ICONO,ACS_URL FROM acceso WHERE ACS_HIJO='"+ idacceso+"';";
		Acceso a = jdbcTemplate.queryForObject(sql,new AccesoRowMapper(),idacceso);
		return a;
	}
	

}





