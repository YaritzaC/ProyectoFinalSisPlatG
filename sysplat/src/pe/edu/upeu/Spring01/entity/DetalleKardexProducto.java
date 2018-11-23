package pe.edu.upeu.Spring01.entity;

public class DetalleKardexProducto {
	
	private int iddetkarpro;
	private int idkarpro;
	private int idprod;
	private double precio;
	private int cantidad;
	private String estado;
	
	public DetalleKardexProducto() {
		super();
	}

	public DetalleKardexProducto(int iddetkarpro, int idkarpro, int idprod, double precio, int cantidad,
			String estado) {
		super();
		this.iddetkarpro = iddetkarpro;
		this.idkarpro = idkarpro;
		this.idprod = idprod;
		this.precio = precio;
		this.cantidad = cantidad;
		this.estado = estado;
	}

	public int getIddetkarpro() {
		return iddetkarpro;
	}

	public void setIddetkarpro(int iddetkarpro) {
		this.iddetkarpro = iddetkarpro;
	}

	public int getIdkarpro() {
		return idkarpro;
	}

	public void setIdkarpro(int idkarpro) {
		this.idkarpro = idkarpro;
	}

	public int getIdprod() {
		return idprod;
	}

	public void setIdprod(int idprod) {
		this.idprod = idprod;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
