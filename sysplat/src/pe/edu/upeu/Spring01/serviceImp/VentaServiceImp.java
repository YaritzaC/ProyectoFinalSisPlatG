package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.VentaDaoImp;
import pe.edu.upeu.Spring01.entity.Venta;
import pe.edu.upeu.Spring01.service.VentaService;
@Service
public class VentaServiceImp implements VentaService {
	@Autowired
	private VentaDaoImp ven;

	@Override
	public int crearVenta(Venta venta) throws SQLException {
		// TODO Auto-generated method stub
		return ven.crearVenta(venta);
	}

	@Override
	public List<Map<String, Object>> ventaPedido(int codigohoja) {
		// TODO Auto-generated method stub
		return ven.ventaPedido(codigohoja);
	}

	@Override
	public List<Map<String, Object>> numeroComprobante() {
		// TODO Auto-generated method stub
		return ven.numeroComprobante();
	}

	@Override
	public List<Map<String, Object>> numeroSerie() {
		// TODO Auto-generated method stub
		return ven.numeroSerie();
	}

	@Override
	public int crearVentaPedidoBoleta(Venta venta) {
		// TODO Auto-generated method stub
		return ven.crearVentaPedidoBoleta(venta);
	}

	@Override
	public int crearVentaPedidoFactura(Venta venta) {
		// TODO Auto-generated method stub
		return ven.crearVentaPedidoFactura(venta);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return ven.readAll();
	}

	@Override
	public int crearVentaFactura(Venta venta) throws SQLException {
		// TODO Auto-generated method stub
		return ven.crearVentaFactura(venta);
	}

	@Override
	public List<Map<String, Object>> listar_venta_pedido() {
		return ven.listar_venta_pedido();
	}

}
