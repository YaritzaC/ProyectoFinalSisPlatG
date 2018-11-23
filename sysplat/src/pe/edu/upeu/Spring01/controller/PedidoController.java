package pe.edu.upeu.Spring01.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import pe.edu.upeu.Spring01.entity.DetalleVenta;
import pe.edu.upeu.Spring01.entity.HojaContrato;
import pe.edu.upeu.Spring01.entity.Pedido;
import pe.edu.upeu.Spring01.entity.Venta;
import pe.edu.upeu.Spring01.service.DetalleVentaService;
import pe.edu.upeu.Spring01.service.HojaContratoService;
import pe.edu.upeu.Spring01.service.OrdenTrabajoService;
import pe.edu.upeu.Spring01.service.VentaService;
import pe.edu.upeu.Spring01.serviceImp.PedidoServiceImp;

@Controller
public class PedidoController {

	@Autowired
	private OrdenTrabajoService ordentrabajo;

	@Autowired
	private HojaContratoService hojacontrato;

	@Autowired
	private VentaService ventapedido;

	@Autowired
	private DetalleVentaService detallepedido;

	@Autowired
	private PedidoServiceImp pedido;

	@GetMapping("/Menu-Pedido")
	public String mainpedido() {
		return "ped_main_pedido";
	}

	@GetMapping("/Lista-Pedidos")
	public ModelAndView producto() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("ped_lista_nuevo_pedido");
		ma.addObject("listaPe", pedido.readAll());
		return ma;
	}

	@GetMapping("/Nuevo-Pedido")
	public String pedido_nuevo() {
		return "ped_nuevo_pedido";
	}

	@GetMapping("/Lista-HC")
	public String lista_hoja_contrato() {
		return "ped_lista_hoja_contrato";
	}

	@GetMapping("/Hoja-Contrato")
	public String hoja_contrato() {
		return "ped_hoja_contrato";
	}

	@GetMapping("/Lista-OT")
	public String lista_orden_trabajo() {
		return "ped_lista_orden_trabajo";
	}

	@GetMapping("/Orden-Trabajo")
	public String orden_trabajo() {
		return "ped_orden_trabajo";
	}

	@GetMapping("/Venta-Pedido")
	public String comprobante_pedido() {
		return "ped_comprobante_pedido";
	}

	private Gson g = new Gson();

	@RequestMapping(value = "/ot")
	public void ordentrabajo(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			out.println(g.toJson(ordentrabajo.ordenTrabajo(Integer.parseInt(request.getParameter("codigopedido")))));
			break;
		case 2:
			out.println(g.toJson(ordentrabajo.ordenTrabajo(Integer.parseInt(request.getParameter("codigopedido")))));
			break;
		case 3:
			out.println(g.toJson(ordentrabajo.ordenTrabajo(Integer.parseInt(request.getParameter("codigopedido")))));
			break;
		case 4:
			out.println(g.toJson(ordentrabajo.ordenTrabajo(Integer.parseInt(request.getParameter("codigopedido")))));
			break;
		}
	}

	@RequestMapping(value = "/hoja")
	public void hojacontrato(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			out.println(g.toJson(hojacontrato.hojaContrato(Integer.parseInt(request.getParameter("codigopedido")))));
			break;
		case 2:
			HojaContrato hoja = new HojaContrato(Integer.parseInt(request.getParameter("idempleado")),
					Integer.parseInt(request.getParameter("idpedido")), Double.parseDouble(request.getParameter("total")),
					Double.parseDouble(request.getParameter("adelanto")));
			out.println(g.toJson(hojacontrato.crearHojaContrato(hoja)));
			break;

		}
	}

	@RequestMapping(value = "/vp")
	public void ventapedido(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			out.println(g.toJson(ventapedido.ventaPedido(Integer.parseInt(request.getParameter("codigohoja")))));
			break;
		case 2:
			Venta venta = new Venta(Integer.parseInt(request.getParameter("idempleado")),
					Integer.parseInt(request.getParameter("idsede")),
					Integer.parseInt(request.getParameter("idcliente")),
					Integer.parseInt(request.getParameter("idhoja")), request.getParameter("tipopago"),
					Double.parseDouble(request.getParameter("total")));
			out.println(g.toJson(ventapedido.crearVenta(venta)));
			break;
		case 3:
			DetalleVenta detalle = new DetalleVenta(Double.parseDouble(request.getParameter("precio")),
					Integer.parseInt(request.getParameter("cantidad")));
			out.println(g.toJson(detallepedido.crearDetallePedido(detalle)));
			break;
		}

	}
	

	@RequestMapping(value = "/ped")
	public void crearpedido(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			Pedido pe = new Pedido(Integer.parseInt(request.getParameter("idempleado")),
					                   Integer.parseInt(request.getParameter("idsede")), 
								       Integer.parseInt(request.getParameter("idcliente")), 
								       request.getParameter("nombre"),
								       Integer.parseInt(request.getParameter("cantidad")),
								       Double.parseDouble(request.getParameter("precio")),
								       request.getParameter("dimension"),
								       request.getParameter("especificacion"),
								       request.getParameter("observacion"));
			out.println(g.toJson(pedido.crearPedido(pe)));
			break;
		}

	}
	
	/*
	 * @PostMapping("/Orden") public ModelAndView main1(Model model,
	 * HttpServletRequest request) {
	 * JOptionPane.showMessageDialog(null,"asasassaas"); HttpSession httpSession =
	 * request.getSession(); String CodigoPedido =
	 * request.getParameter("codigopedido"); ModelAndView ma = new ModelAndView();
	 * try { List<Map<String, Object>> lista =
	 * ordentrabajo.ordenTrabajo(Integer.parseInt(CodigoPedido)); if
	 * (!lista.isEmpty()) { ma.setViewName("Orden-Trabajo"); for (Map<String,
	 * Object> map : lista) { System.out.println(map.get("CLI_NOMBRE") + "/" +
	 * map.get("PED_ID") +"// "+map.get("PED_FECHA")); }
	 * httpSession.setAttribute("lista", lista); ma.addObject("lista",
	 * (List<Map<String, Object>>) httpSession.getAttribute("lista")); } else {
	 * httpSession.invalidate(); ma.setViewName("redirect:/"); }
	 * 
	 * } catch (Exception e) { // TODO: handle exception
	 * ma.setViewName("redirect:/"); } return ma; }
	 */

}
