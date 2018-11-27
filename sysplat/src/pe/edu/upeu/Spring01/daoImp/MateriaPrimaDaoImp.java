package pe.edu.upeu.Spring01.daoImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.ClienteDao;
import pe.edu.upeu.Spring01.dao.CompraDao;
import pe.edu.upeu.Spring01.dao.DetalleOrdenCompraDao;
import pe.edu.upeu.Spring01.dao.MateriaOrdenDao;
import pe.edu.upeu.Spring01.dao.MateriaPrimaDao;
import pe.edu.upeu.Spring01.entity.Cliente;
import pe.edu.upeu.Spring01.entity.Compra;
import pe.edu.upeu.Spring01.entity.MateriaOrden;
import pe.edu.upeu.Spring01.entity.MateriaPrima;

@Repository
public class MateriaPrimaDaoImp implements MateriaPrimaDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(MateriaPrima materiaprima) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MateriaPrima materiaprima) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MateriaPrima read(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public MateriaPrima buscarMateriaPrima(String p) {
		MateriaPrima materia = new MateriaPrima();
		try {
			String sql="{ call ped_buscar_materia_prima(?) }";
			materia= jdbcTemplate.queryForObject(sql, new MateriaPrimaRowMapper(),p);
		} catch (Exception e) {
			System.out.println("Error fatal" + e);
		}
		return materia;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}