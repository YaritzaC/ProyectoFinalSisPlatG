package pe.edu.upeu.Spring01.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import pe.edu.upeu.Spring01.dao.CompraDao;
import pe.edu.upeu.Spring01.dao.DetalleOrdenCompraDao;
import pe.edu.upeu.Spring01.dao.OrdenCompraDao;
import pe.edu.upeu.Spring01.entity.DetalleOrdenCompra;
import pe.edu.upeu.Spring01.entity.Empleado;
import pe.edu.upeu.Spring01.entity.OrdenCompra;
import pe.edu.upeu.Spring01.entity.Pedido;
import pe.edu.upeu.Spring01.entity.Producto;
import pe.edu.upeu.Spring01.service.CompraService;
import pe.edu.upeu.Spring01.service.DetalleOrdenCompraService;
import pe.edu.upeu.Spring01.service.OrdenCompraService;
import pe.edu.upeu.Spring01.service.ProductoService;
import pe.edu.upeu.Spring01.serviceImp.DetalleOrdenCompraServiceImp;
import pe.edu.upeu.Spring01.serviceImp.EmpleadoServiceImp;
import pe.edu.upeu.Spring01.serviceImp.OrdenCompraServiceImp;

@Controller
public class CompraController {

	private Gson gson = new Gson();

	public static ArrayList<Producto> produ = new ArrayList<>();
	
	public  int cantidadesco;

	@Autowired
	private ProductoService productoservice;

	@Autowired
	private CompraService cmp;

	@Autowired
	private CompraDao cmpDao;

	@Autowired
	private DetalleOrdenCompraService doc;

	@Autowired
	private DetalleOrdenCompraServiceImp docImp;

	@Autowired
	private DetalleOrdenCompraDao docDao;
	
	@Autowired
	private OrdenCompraService ordcompra;

	@Autowired
	private OrdenCompraDao ordDao;

	@Autowired
	private OrdenCompraServiceImp ordcompraIm;

	/*
	 * Mandar al menu principal
	 */
	@GetMapping("/Compras")
	public String compras() {
		System.out.println("Compras");
		return "com_main_main";
	}

	/*
	 * Modulo de compras Me lista los productos que tienen en el stock menores a 5
	 * Ya funciona no tocar
	 * 
	 * Parte numero 1.1
	 */
	
	@RequestMapping("/Crear-Orden-Compras")
		public ModelAndView registrar() {
			ModelAndView ma = new ModelAndView();
			ma.setViewName("com_main_listascompras(Aceptar)");
			ma.addObject("listasCompras", productoservice.readAllMenor());
			return ma;
		}

	/*	
	 * Parte numero 1.2.1
	 */
	
	/*@RequestMapping(value = "/OrdenCompra")
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			int op = Integer.parseInt(request.getParameter("opc"));
			HttpSession sesion = request.getSession();
			switch (op) {
			case 2:
				out.println(gson.toJson(productoservice.readAllMenor()));
				break;
			}
		}
	}

	@GetMapping("/Aceptar-Orden-de-Compra")
	public ModelAndView aceptarComprapro() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("com_main_listascompras(Aceptar)");
		ma.addObject("listaCom", produ);
		return ma;
	}

	/*
	 * Parte numero 1.2.2
	 */

	@RequestMapping(value = "/ordenCom")
	public void crearpedido(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			System.out.println("Crear Orden");
			OrdenCompra ORDCOM = new OrdenCompra(Integer.parseInt(request.getParameter("idproveedor")),
					Integer.parseInt(request.getParameter("idempleado")), 
					request.getParameter("tipo"));
			out.println(gson.toJson(ordcompraIm.crearOrdenCompra(ORDCOM)));
			break;
		case 2:
			System.out.println("Crear Detalle");
			DetalleOrdenCompra DOC = new DetalleOrdenCompra(Integer.parseInt(request.getParameter("idproducto")),
					Integer.parseInt(request.getParameter("idmateria")),
					Double.parseDouble(request.getParameter("precio")),
					Integer.parseInt(request.getParameter("cantidad")));
			out.println(gson.toJson(docImp.create(DOC)));
			break;
		case 3:
            out.println(gson.toJson(docDao.detalle(Integer.parseInt(request.getParameter("id")))));
        break;
		case 4:
			System.out.println("Crear Listar productos");
			out.println(gson.toJson(productoservice.readAllMenor()));
			break;
			
		}

	}

	/*
	 * Modulo de Registrar orden compra Me lista las ordenes de compra Ya funciona
	 * no tocar
	 * 
	 * Parte numero 2.1
	 */

	@GetMapping("/Registrar-Orden-Compra")
	public ModelAndView registrarordencompra() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("com_main_registrarcompra");
		ma.addObject("listasCompras", doc.listarordencompra());
		return ma;
	}

	/*
	 * Parte numero 2.2
	 */

	@GetMapping("/Registrar-Listas-Compras")
	public String registrarlistascompras() {
		return "com_main_registrarproductos";
	}

	/*
	 * Modulo de ingresar productos Me lista las ordenes de compra Ya funciona no
	 * tocar
	 * 
	 * Parte 3.1
	 */

	@GetMapping("/Registrar-Listas")
	public ModelAndView registrarlistas() {
		System.out.println("com_main_registrarproducto");
		System.out.println("Creo que si se actualiza");
		ModelAndView ma = new ModelAndView();
		ma.setViewName("com_main_listas_compras");
		ma.addObject("listasRegistras", doc.listarordencompra());
		return ma;
	}

	/*
	 * Parte numero 3.2
	 */

	/*
	 * @RequestMapping("/Ingresar-Productos-Comprados") public ModelAndView
	 * ingresarproductos(@RequestParam("id") int id) { ModelAndView model = new
	 * ModelAndView(); model.setViewName("com_main_registrarproducto");
	 * model.addObject("lisProList", ordcompra.traerproductos(id)); return model; }
	 */

	/*
	 * Parte que me listara de acuerdo al id de la lista
	 */
	@RequestMapping(value = "/compra")
	public void cliente(ModelAndView model, HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			out.println(gson.toJson(cmp.read(Integer.parseInt(request.getParameter("idcompra")))));
			break;
		}
	}

	/*
	 * Modulo de Productos
	 */
	@GetMapping("/Productos")
	public ModelAndView productos() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("com_producto");
		ma.addObject("listaPro", productoservice.readAll());
		return ma;
	}

	/*
	 * Modulo de Proveedor
	 */

	@GetMapping("/Proveedores")
	public String proveedor() {
		System.out.println("idfefesf");
		return "proveedor";
	}

}
