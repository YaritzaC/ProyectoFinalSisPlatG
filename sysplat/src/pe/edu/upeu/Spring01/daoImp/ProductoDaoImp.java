package pe.edu.upeu.Spring01.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;

import pe.edu.upeu.Spring01.dao.ProductoDao;
import pe.edu.upeu.Spring01.entity.OrdenCompra;
import pe.edu.upeu.Spring01.entity.Producto;
import pe.edu.upeu.Spring01.test.conexion;
@Repository
public class ProductoDaoImp implements ProductoDao {
	
	private CallableStatement cst;
	    private ResultSet rs;
	    private Connection cx;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public Producto buscarProducto(String p) {
		Producto pro = new Producto();
		try {
			String sql = "{ call ven_buscar_codigo_producto(?) }";
			pro = jdbcTemplate.queryForObject(sql, new ProductoRowMapper(), p);
		} catch (Exception e) {
			System.out.println("Error fatal" + e);
		}
		return pro;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForList("{call com_listar_productos()}");
	}

	@Override
	public List<Map<String, Object>> readAllMenor() {
		// TODO Auto-generated method stub
		        List<Map<String, Object>> datos = new ArrayList<>();
		        try {
		            cx = (Connection) conexion.getConexion();
		            cst = cx.prepareCall("{call com_listar_productos_menores()}");
		            rs = cst.executeQuery();
		            while (rs.next()) {
		                Map<String, Object> map = new HashMap<>();
		                map.put("idProducto", rs.getInt("PRO_ID"));
		                map.put("Nombre", rs.getInt("PRO_NOMBRE"));
		                map.put("stock", rs.getInt("PRO_STOCK"));
		                datos.add(map);
		            }
		        } catch (SQLException e) {
		            System.out.println("Error: " + e);
		        }
		        return datos;
		    }
		//String sql="{call com_listar_productos_menores()}";
		//return this.jdbcTemplate.queryForList(sql); 
}
