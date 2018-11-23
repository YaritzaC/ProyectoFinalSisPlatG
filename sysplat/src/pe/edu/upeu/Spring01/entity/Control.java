package pe.edu.upeu.Spring01.entity;

public class Control {

	private int idcontrol;
	private int idempleado;
	private String accion;
	private String fecha;
	private String tabla;

	public Control() {
		super();
	}

	public Control(int idcontrol, int idempleado, String accion, String fecha, String tabla) {
		super();
		this.idcontrol = idcontrol;
		this.idempleado = idempleado;
		this.accion = accion;
		this.fecha = fecha;
		this.tabla = tabla;
	}

	public int getIdcontrol() {
		return idcontrol;
	}

	public void setIdcontrol(int idcontrol) {
		this.idcontrol = idcontrol;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTabla() {
		return tabla;
	}

	public void setTabla(String tabla) {
		this.tabla = tabla;
	}

}
