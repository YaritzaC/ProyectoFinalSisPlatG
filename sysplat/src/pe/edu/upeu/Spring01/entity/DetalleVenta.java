package pe.edu.upeu.Spring01.entity;

public class DetalleVenta {

	private int detalleventaid;
	private int ventaid;
	private int productoid;
	private double precio;
	private int cantidad;
	private double importe;
	private String estado;

	
	public DetalleVenta() {
		super();
	}

	public DetalleVenta(double precio, int cantidad) {
		super();
		this.precio = precio;
		this.cantidad = cantidad;
	}
		
	public DetalleVenta(int productoid, double precio, int cantidad) {
		super();
		this.productoid = productoid;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getDetalleventaid() {
		return detalleventaid;
	}

	public void setDetalleventaid(int detalleventaid) {
		this.detalleventaid = detalleventaid;
	}

	public int getVentaid() {
		return ventaid;
	}

	public void setVentaid(int ventaid) {
		this.ventaid = ventaid;
	}

	public int getProductoid() {
		return productoid;
	}

	public void setProductoid(int productoid) {
		this.productoid = productoid;
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

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
