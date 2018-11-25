package pe.edu.upeu.Spring01.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import pe.edu.upeu.Spring01.entity.Compra;
import pe.edu.upeu.Spring01.entity.Empleado;
import pe.edu.upeu.Spring01.entity.Producto;
import pe.edu.upeu.Spring01.service.ProductoService;
import pe.edu.upeu.Spring01.serviceImp.CompraServiceImp;

@Controller
public class CompraController {

	private Gson gson;

	@Autowired
	private ProductoService productoservice;

	@Autowired
	private CompraServiceImp cmp;

	@GetMapping("/Compras")
	public String compras() {
		return "com_main_main";
	}

	@PostMapping("/acceso1")
	public ModelAndView main1(Model model, HttpServletRequest request) {

		return null;
	}

	@GetMapping("/Crear-Orden-Compra")
	public String crearordencompra() {
		return "com_main_listascompras";
	}

	@GetMapping("/Registrar-Orden-Compra")
	public String registrarordencompra() {
		return "com_main_registrarcompra";
	}

	@GetMapping("/Aceptar-Orden-de-Compra")
	public String registrarordencompra2() {

		return "com_main_listascompras2";
	}

	@GetMapping("/Ingresar-Productos-Comprados")
	public String ingresarproductos() {

		return "com_main_listascompras2";
	}

	@GetMapping("/Proveedores")
	public String proveedor() {
		return "proveedor";
	}
	
	@GetMapping("/Productos")
	public ModelAndView productos() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("com_producto");
		ma.addObject("listaPro", productoservice.readAll());
		return ma;
	}

	@GetMapping("/listord")
	public ModelAndView compra() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("user");
		ma.addObject("lista", cmp.readAll());
		return ma;
	}

	@PostMapping("/saveCompra")
	public String compra(String idproducto, String stock, String estado, Model model, Compra compra)
			throws SQLException {
		compra.setEstado("1");
		cmp.create(compra);
		return "redirect:/main/user";
	}

	@RequestMapping(value = "/liscom")
	public void cliente(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			out.println(gson.toJson(productoservice.readAll()));
			break;

		/*
		 * case 1: int idv; idv = pr.create(new
		 * Prestamo(request.getParameter("fec_pre"), request.getParameter("alu"),
		 * request.getParameter("fe_devo"), request.getParameter("horaPre"),
		 * request.getParameter("horadev"), request.getParameter("aula"),
		 * Integer.parseInt(request.getParameter("prof")),
		 * Integer.parseInt(request.getParameter("docu")),
		 * Integer.parseInt(request.getParameter("user")))); if(idv>0){
		 * out.println(idv); }else{ out.println(0); }
		 * 
		 * 
		 * break; case 2: out.println(g.toJson(pr.readAll())); break; case 3:
		 * out.println(g.toJson(pr.read(Integer.parseInt(request.getParameter("id")))));
		 * break;
		 * 
		 * case 5:
		 * out.println(g.toJson(prof.SearchDniprof(request.getParameter("dni"))));
		 * break; case 6: out.println(g.toJson(pr.readDocument())); break; case 7:
		 * out.println(g.toJson(pr.detalle(Integer.parseInt(request.getParameter("id")))
		 * )); break; case 8: Reserva r =new
		 * Reserva(Integer.parseInt(request.getParameter("idres")));
		 * pr.updateReserva(r); break; case 10:
		 * out.println(g.toJson(pr.Reserva(Integer.parseInt(request.getParameter("idr"))
		 * ))); break; case 11:
		 * out.println(g.toJson(pr.DetReserva(Integer.parseInt(request.getParameter(
		 * "idd"))))); break;
		 */
		}
	}
}
