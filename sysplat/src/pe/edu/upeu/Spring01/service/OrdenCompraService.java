package pe.edu.upeu.Spring01.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.Spring01.entity.MateriaOrden;
import pe.edu.upeu.Spring01.entity.OrdenCompra;
import pe.edu.upeu.Spring01.entity.OrdenTrabajo;
import pe.edu.upeu.Spring01.entity.Pedido;
import pe.edu.upeu.Spring01.entity.Producto;
import pe.edu.upeu.Spring01.entity.Proveedor;

public interface OrdenCompraService {

	public int create();
	public int update(OrdenCompra ordencompra);
	public OrdenCompra buscarOrdenCompra(int ord);
	public OrdenCompra read(int key);
	public List<Map<String, Object>> readAll();
	public List<Map<String, Object>> traerproductos(int idCompra);
	public int crearOrdenCompra(OrdenCompra crearorden);

}
