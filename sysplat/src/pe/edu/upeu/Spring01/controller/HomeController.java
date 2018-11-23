package pe.edu.upeu.Spring01.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upeu.Spring01.entity.Empleado;
import pe.edu.upeu.Spring01.serviceImp.EmpleadoServiceImp;

@Controller
public class HomeController {
	@Autowired
	private EmpleadoServiceImp emp;

	HttpSession httpSession;

	@GetMapping("/")
	public ModelAndView index(HttpServletRequest request) {
		ModelAndView ma = new ModelAndView();
		try {
			HttpSession abc = request.getSession();
			abc.getAttribute("user");
			abc.invalidate();
			ma.setViewName("index");

		} catch (Exception e) {
			// TODO: handle exception

		}
		return ma;
	}

	Object idempleado = 0;
	Object idsede = 0;
	Object tipo;

	@SuppressWarnings("unchecked")
	@PostMapping("/home")
	public ModelAndView main1(Model model, HttpServletRequest request) {
		System.out.println(request.getParameter("user") + " / " + request.getParameter("password"));
		HttpSession httpSession = request.getSession();
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		Empleado em = new Empleado(1, user, password);
		ModelAndView ma = new ModelAndView();
		try {
			List<Map<String, Object>> lista = emp.validarEmpleado(em);
			if (!lista.isEmpty()) {
				ma.setViewName("principal");
				for (Map<String, Object> map : lista) {
					System.out.println(map.get("SED_ID") + "/" + map.get("EMPL_ID") + "// " + map.get("ACS_NOMBRE"));
					idempleado = map.get("EMPL_ID");
					idsede = map.get("SED_ID");
					tipo = map.get("EMPL_TIPO");
				}
				httpSession.setAttribute("user", em.getUser());
				ma.addObject("user", (String) httpSession.getAttribute("user"));
				
				httpSession.setAttribute("lista", lista);
				ma.addObject("lista", (List<Map<String, Object>>) httpSession.getAttribute("lista"));
				
				httpSession.setAttribute("idempleado", (int) idempleado);
				ma.addObject("idempleado", (int) httpSession.getAttribute("idempleado"));
				
				httpSession.setAttribute("idsede", (int) idsede);
				ma.addObject("idsede", (int) httpSession.getAttribute("idsede"));
				
				httpSession.setAttribute("tipo", (String) tipo);
				ma.addObject("tipo", (String) httpSession.getAttribute("tipo"));
				
				System.out.println(idempleado + "asasas" + idsede + "  affaf" + tipo);
				idempleado();
				
			} else {
				httpSession.invalidate();
				ma.setViewName("redirect:/");
			}

		} catch (Exception e) {
			// TODO: handle exception
			ma.setViewName("redirect:/");
		}
		return ma;
	}/*
		 * @GetMapping("/upd/{id}") public ModelAndView sub_accesos(@PathVariable("id")
		 * int idacceso) { ModelAndView model = new ModelAndView();
		 * System.out.println(idacceso); Acceso a = acs.subAccesos(4);
		 * model.addObject("listado",a); model.setViewName("ped_main_pedido"); return
		 * model; }
		 */

	

	@GetMapping("/home")
	public String main2() {
		return "index";
	}

	public void idempleado() {
		System.out.println("Soy empleado" + idempleado);
	
	}

	@GetMapping("/Empleados")
	public String usuario() {
		return "empleado";
	}

	@GetMapping("/Principal")
	public String principal() {
		return "principal";
	}

	@GetMapping("/Reportes")
	public String reporte() {
		return "reportes";
	}

}
