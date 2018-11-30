package pe.edu.upeu.Spring01.daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
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
import pe.edu.upeu.Spring01.entity.Cliente;
import pe.edu.upeu.Spring01.entity.Compra;
import pe.edu.upeu.Spring01.entity.DetalleOrdenCompra;
import pe.edu.upeu.Spring01.entity.Producto;
import pe.edu.upeu.Spring01.test.conexion;

@Repository
public class DetalleOrdenCompraDaoImp implements DetalleOrdenCompraDao {
	
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
	public int create(DetalleOrdenCompra detalleordcom) throws SQLException {
		// Ingresa los datos a la tabla ordenCompra
		String sql = null;
		try {
			sql="{ call com_agregar_detalle_compra(?,?,?,?)}";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return jdbcTemplate.update(sql, detalleordcom.getIdproducto(),detalleordcom.getCantidad(),detalleordcom.getIdMTP(),detalleordcom.getPrecio());
	}

	@Override
	public int update(DetalleOrdenCompra detalleordcom) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DetalleOrdenCompraDao read(int compras) {
		// Lista los productos por el id que se le manda
		String sql = "{ com_listar_productos_orden(?) }";
		DetalleOrdenCompra doc = jdbcTemplate.queryForObject(sql, new DetalleOrdenCompraRowMapper(), compras);
		return (DetalleOrdenCompraDao) doc;		
	}

	@Override
	public List<Map<String, Object>> listarordencompra() {
		// Lista las ordenes de compra
		return this.jdbcTemplate.queryForList("{call com_listar_detalle()}");
	}

	@Override
	public List<Map<String, Object>> buscarProducto(int compras) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto detalle(int key) {
		Producto pl = new Producto();
        try {
            cx = conexion.getConexion();
            cst = cx.prepareCall("{call AddProductoDetalle(?)}");
            cst.setInt(1, key);
            rs = cst.executeQuery();
            while (rs.next()) {
                pl.setIdproducto(rs.getInt(1));
                pl.setNombre(rs.getString(2));
                pl.setEstado(String.valueOf(rs.getInt(3)));
            }
        } catch (SQLException e) {
            System.out.println("Error:" + e);
        }
        return pl;
	}

}