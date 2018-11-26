package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.Venta;

public interface VentaDao {
	public int crearVenta(Venta venta)throws SQLException;
	public int crearVentaFactura(Venta venta)throws SQLException;
	
	public List<Map<String, Object>> ventaPedido(int codigohoja);
	public List<Map<String, Object>> numeroComprobante();
	public List<Map<String, Object>> numeroSerie();
	
	//Pedido
	public int crearVentaPedidoBoleta(Venta venta);
	public int crearVentaPedidoFactura(Venta venta);
	
	//Listar ventas
	public List<Map<String, Object>> readAll();
	
	//Lista Venta Pedido
	public List<Map<String, Object>> listar_venta_pedido();
	
	
}
