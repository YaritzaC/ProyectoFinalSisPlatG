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
		ma.addObject("listaCli", clienteservice.readAll());
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
			out.println(g.toJson(ventaservice.numeroComprobante()));
			break;
		case 2:
			out.println(g.toJson(ventaservice.numeroSerie()));
			break;
		}
	}
	
	
}
