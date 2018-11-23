package pe.edu.upeu.Spring01.entity;

public class MateriaOrden {
	
	private int idmateriaorden;
	private int idodt;
	private int idmtp;
	private double cantidad;
	private String descripcion;
	private String estado;
	
	public MateriaOrden() {
		super();
	}

	public MateriaOrden(int idmateriaorden, int idodt, int idmtp, double cantidad, String descripcion, String estado) {
		super();
		this.idmateriaorden = idmateriaorden;
		this.idodt = idodt;
		this.idmtp = idmtp;
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getIdmateriaorden() {
		return idmateriaorden;
	}

	public void setIdmateriaorden(int idmateriaorden) {
		this.idmateriaorden = idmateriaorden;
	}

	public int getIdodt() {
		return idodt;
	}

	public void setIdodt(int idodt) {
		this.idodt = idodt;
	}

	public int getIdmtp() {
		return idmtp;
	}

	public void setIdmtp(int idmtp) {
		this.idmtp = idmtp;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
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
