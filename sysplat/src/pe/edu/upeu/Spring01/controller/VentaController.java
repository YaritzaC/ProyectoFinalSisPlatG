package pe.edu.upeu.Spring01.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import pe.edu.upeu.Spring01.entity.Venta;
import pe.edu.upeu.Spring01.service.ClienteService;
import pe.edu.upeu.Spring01.service.ProductoService;
import pe.edu.upeu.Spring01.service.VentaService;
@Controller
public class VentaController {
	
	@Autowired
	private ClienteService clienteservice;
	
	@Autowired
	private ProductoService productoservice;
	
	@Autowired
	private VentaService ventaservice;
	
	@GetMapping("/Clientes")
	public ModelAndView clienteLista() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("ven_lista_cliente");
		ma.addObject("listaCliente", clienteservice.readAll());
		return ma;
	}

	@GetMapping("/Menu-Venta")
	public String ventaMenu() {
		return "ven_main_venta";
	}

	@GetMapping("/Lista-Venta")
	public ModelAndView ventaLista() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("ven_lista_venta");
		ma.addObject("listaVen", ventaservice.readAll());
		return ma;
	}
	
	
	
	@GetMapping("/Nuevo-Venta")
	public ModelAndView producto() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("venta");
		ma.addObject("listaProd", productoservice.readAll());
		return ma;
	}
	
	private Gson g = new Gson();
	 HomeController hm = new HomeController();
	
	@RequestMapping(value = "/hc")
	public void cliente(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			out.println(g.toJson(clienteservice.buscarCliente(request.getParameter("nombre"))));
			break;
		}
	}
	
	@RequestMapping(value = "/pc")
	public void producto(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			// Busco por código al producto
			out.println(g.toJson(productoservice.buscarProducto(request.getParameter("codigo"))));
			break;
		}
	}
	
	@RequestMapping(value = "/vc")
	public void venta(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			// Cargo el número de comprobante
			out.println(g.toJson(ventaservice.numeroComprobante()));
			break;
		case 2:
			// Cargo el número de serie
			out.println(g.toJson(ventaservice.numeroSerie()));
			break;
		case 3:
			// Crear venta boleta
			Venta v = new Venta (Integer.parseInt(request.getParameter("idempleado")),
								 Integer.parseInt(request.getParameter("idsede")),
								 Integer.parseInt(request.getParameter("idcliente")),
								 request.getParameter("pago"),
								 Double.parseDouble(request.getParameter("total")),
								 request.getParameter("documento"));
			out.println(g.toJson(ventaservice.crearVenta(v)));
			break;
		case 4:
			// Crear venta factura
			Venta ven = new Venta (Integer.parseInt(request.getParameter("idempleado")),
					 Integer.parseInt(request.getParameter("idsede")),
					 Integer.parseInt(request.getParameter("idcliente")),
					 request.getParameter("pago"),
					 Double.parseDouble(request.getParameter("subtotal")),
					 request.getParameter("documento"));
			out.println(g.toJson(ventaservice.crearVentaFactura(ven)));
			break;
		}
	}
	
	
}
