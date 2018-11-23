package pe.edu.upeu.Spring01.entity;

public class Acceso {
	private int idacceso;
	private int idhijo;
	private String nombre;
	private String orden;
	private String icono;
	private String url;
	private String color;
	private String descripcion;
	private String estado;

	public Acceso() {
		super();
	}

	public Acceso(int idacceso, int idhijo, String nombre, String orden, String icono, String url, String color,
			String descripcion, String estado) {
		super();
		this.idacceso = idacceso;
		this.idhijo = idhijo;
		this.nombre = nombre;
		this.orden = orden;
		this.icono = icono;
		this.url = url;
		this.color = color;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getIdacceso() {
		return idacceso;
	}

	public void setIdacceso(int idacceso) {
		this.idacceso = idacceso;
	}

	public int getIdhijo() {
		return idhijo;
	}

	public void setIdhijo(int idhijo) {
		this.idhijo = idhijo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
