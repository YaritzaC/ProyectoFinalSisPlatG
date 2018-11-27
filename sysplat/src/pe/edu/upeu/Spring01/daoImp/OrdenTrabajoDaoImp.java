package pe.edu.upeu.Spring01.daoImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.OrdenTrabajoDao;
import pe.edu.upeu.Spring01.entity.MateriaOrden;
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
		 sql="SELECT C.CLI_NOMBRE,P.PED_ID, P.PED_CODIGO, P.PED_NOMBRE, P.PED_FECHA, E.EMPL_ID  FROM \n" + 
					"PEDIDO AS P, EMPLEADO AS E, CLIENTE AS C WHERE P.PED_CODIGO='"+codigopedido+"' "
							+ "and E.EMPL_ID=P.EMPL_ID AND C.CLI_ID=P.CLI_ID;";
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public int create(OrdenTrabajo codigopedido) throws SQLException {
		return 0;
	}

	@Override
	public List<Map<String, Object>> listar_orden_trabajo() {
		return this.jdbcTemplate.queryForList("{ call ped_listar_orden_trabajo()}");
	}

	@Override
	public List<Map<String, Object>> listar_materia_prima() {	
		return this.jdbcTemplate.queryForList("{ call ped_listar_materias_primas()}");
	}

	@Override
	public int crearOrdenTrabajo(OrdenTrabajo orden) {
		String sql = null;
		try {
			sql="{ call ped_crear_orden_trabajo(?,?)}";
		} catch (Exception e) {
			System.out.println("Error " + e);	
			}
		return jdbcTemplate.update(sql, orden.getIdempleado(), orden.getIdpedido() );
	}

	@Override
	public int crearMateriaOrden(MateriaOrden materia) {
		String sql = null;
		try {
			sql="{ call ped_crear_materia_orden(?)}";
		} catch (Exception e) {
			System.out.println("Error   " + e);	
			}
		return jdbcTemplate.update(sql, materia.getIdmtp() );
	}
}
