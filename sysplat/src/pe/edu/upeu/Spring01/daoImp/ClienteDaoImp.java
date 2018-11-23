package pe.edu.upeu.Spring01.daoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.ClienteDao;
import pe.edu.upeu.Spring01.entity.Cliente;

@Repository
public class ClienteDaoImp implements ClienteDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Cliente buscarCliente(String c) {
		String sql = "{ call ven_buscar_cliente(?) }";
		Cliente cli = jdbcTemplate.queryForObject(sql, new ClienteRowMapper(), c);
		return cli;
	}

}