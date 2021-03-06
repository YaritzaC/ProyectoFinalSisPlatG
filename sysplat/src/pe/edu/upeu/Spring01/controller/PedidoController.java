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
import pe.edu.upeu.Spring01.entity.MateriaOrden;
import pe.edu.upeu.Spring01.entity.OrdenTrabajo;
import pe.edu.upeu.Spring01.entity.Pedido;
import pe.edu.upeu.Spring01.entity.Venta;
import pe.edu.upeu.Spring01.service.DetalleVentaService;
import pe.edu.upeu.Spring01.service.HojaContratoService;
import pe.edu.upeu.Spring01.service.MateriaPrimaService;
import pe.edu.upeu.Spring01.service.OrdenTrabajoService;
import pe.edu.upeu.Spring01.service.VentaService;
import pe.edu.upeu.Spring01.serviceImp.PedidoServiceImp;

@Controller
public class PedidoController {

	@Autowired
	private MateriaPrimaService materia;
	
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
	@GetMapping("/Lista-OT")
	public ModelAndView listaordenes() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("ped_lista_orden_trabajo");
		ma.addObject("listaOrden", ordentrabajo.listar_orden_trabajo());
		return ma;
	}
	@GetMapping("/Lista-HC")
	public ModelAndView listahojas() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("ped_lista_hoja_contrato");
		ma.addObject("listaHoja", hojacontrato.listar_hoja_contrato() );
		return ma;
	}
	@GetMapping("/Lista-Comprobante-Pedido")
	public ModelAndView listaComprobantePedido() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("ped_lista_comprobante_pedido");
		ma.addObject("listaComprobante", ventapedido.listar_venta_pedido());
		return ma;
	}
	@GetMapping("/Orden-Trabajo")
	public ModelAndView comprobante_pedido() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("ped_orden_trabajo");
		ma.addObject("listamateria", ordentrabajo.listar_materia_prima());
		return ma;
	}
	
	@GetMapping("/Nuevo-Pedido")
	public String pedido_nuevo() {
		return "ped_nuevo_pedido";
	}

	@GetMapping("/Hoja-Contrato")
	public String hoja_contrato() {
		return "ped_hoja_contrato";
	}
	
	@GetMapping("/Venta-Pedido")
	public String comprobantepedido() {
		return "ped_comprobante_pedido";
	}
	

	private Gson g = new Gson();

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
			out.println(g.toJson(materia.buscarMateriaPrima(request.getParameter("materia"))));
			break;
		case 3:
			OrdenTrabajo orden = new OrdenTrabajo(Integer.parseInt(request.getParameter("idemp")),
					Integer.parseInt(request.getParameter("idped")));
			ordentrabajo.crearOrdenTrabajo(orden);
			break;
		case 4:
			MateriaOrden materia = new MateriaOrden(Integer.parseInt(request.getParameter("idmateria")));
			ordentrabajo.crearMateriaOrden(materia);
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
			ventapedido.crearVentaPedidoBoleta(venta);
			break;
		case 3:
			DetalleVenta detalle = new DetalleVenta(Double.parseDouble(request.getParameter("precio")),
					Integer.parseInt(request.getParameter("cantidad")));
			detallepedido.crearDetallePedido(detalle);
			break;
		case 4:
			Venta ven = new Venta(Integer.parseInt(request.getParameter("idempleado")),
					Integer.parseInt(request.getParameter("idsede")),
					Integer.parseInt(request.getParameter("idcliente")),
					Integer.parseInt(request.getParameter("idhoja")), request.getParameter("tipopago"),
					Double.parseDouble(request.getParameter("total")));
			ventapedido.crearVentaPedidoFactura(ven);
			break;
		}

	}
	

	
}
