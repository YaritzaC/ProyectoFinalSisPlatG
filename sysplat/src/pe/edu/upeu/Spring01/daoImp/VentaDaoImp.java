package pe.edu.upeu.Spring01.daoImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.VentaDao;
import pe.edu.upeu.Spring01.entity.Venta;
@Repository
public class VentaDaoImp implements VentaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public List<Map<String, Object>> ventaPedido(int codigohoja) {
		String sql="";
		try {
			sql="SELECT HC.HCT_ID,C.CLI_ID,C.CLI_NOMBRE, P.PED_ID,HC.HCT_CODIGO, HC.HCT_FECHA, P.PED_NOMBRE, E.EMPL_ID, \n" + 
					"P.PED_CANTIDAD , P.PED_PRECIO , HC.HCT_TOTAL,HC.HCT_ADELANTO,HC.HCT_MITADTOTAL\n" + 
					" FROM  PEDIDO AS P, EMPLEADO AS E, CLIENTE AS C, HOJACONTRATO AS HC\n" + 
					"WHERE P.PED_CODIGO='"+codigohoja+"' and E.EMPL_ID=P.EMPL_ID AND  C.CLI_ID=P.CLI_ID "
							+ "AND P.PED_ID=HC.PED_ID;";
		} catch (Exception e) {
			System.out.println("Error" + e);
		}

		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public List<Map<String, Object>> numeroComprobante() {
		// TODO Auto-generated method stub
		
		
		return this.jdbcTemplate.queryForList("{ call ven_numero_comprobante() }");
	}

	@Override
	public List<Map<String, Object>> numeroSerie() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForList("{ call ven_numero_serie() }");
	}
	@Override
	public int crearVenta(Venta venta) throws SQLException {
		String sql = null;
		try {
			sql="{ call ven_crear_venta_boleta(?,?,?,?,?,?)}";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return jdbcTemplate.update(sql, venta.getIdempleado(), venta.getIdsede(), venta.getIdcliente(), venta.getTipopago(), 
				venta.getTipodocumento(), venta.getTotal());
	}
	
	@Override
	public int crearVentaFactura(Venta venta) throws SQLException {
		// TODO Auto-generated method stub
		String sql = null;
		try {
			sql="{ call ven_crear_venta_factura_no_incluido(?,?,?,?,?,?)}";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return jdbcTemplate.update(sql, venta.getIdempleado(), venta.getIdsede(), venta.getIdcliente(), venta.getTipopago(), 
				venta.getTipodocumento(), venta.getTotal());
	}

	@Override
	public int crearVentaPedidoBoleta(Venta venta) {
		String sql = null;
		try {
			sql="{ call ped_crear_venta_contrato_boleta(?,?,?,?,?,?)}";
		} catch (Exception e) {
			System.out.println("Error   " + e);
		}
		return jdbcTemplate.update(sql, venta.getIdempleado(), venta.getIdsede(), 
				venta.getIdcliente(), venta.getIdhojacontrato(), venta.getTipopago(), venta.getTotal());
	}

	@Override
	public int crearVentaPedidoFactura(Venta venta) {
		String sql = null;
		try {
			sql="{ call ped_crear_venta_contrato_factura(?,?,?,?,?,?)}";
		} catch (Exception e) {
			System.out.println("Error   " + e);		}
		return jdbcTemplate.update(sql, venta.getIdempleado(), venta.getIdsede(), 
				venta.getIdcliente(), venta.getIdhojacontrato(), venta.getTipopago(), venta.getTotal());
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForList("{ call ven_listar_ventas() }");
	}

	@Override
	public List<Map<String, Object>> listar_venta_pedido() {
		// TODO Auto-generated method stub
		return  this.jdbcTemplate.queryForList("{ call ped_listar_ventas_pedidos() }");
	}

}
