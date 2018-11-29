package pe.edu.upeu.Spring01.entity;

public class DetalleOrdenCompra {
	
	private int iddtoc;
	private int idcompra;
	private int idordencompra;
	private int idproducto;
	private int idMTP;
	private String detalle;
	private double precio;
	private int cantidad;
	private String estado;
	
	public DetalleOrdenCompra() {
		super();
	}

	public DetalleOrdenCompra(int iddtoc, int idcompra, int idordencompra, int idproducto, int idMTP, String detalle,
			double precio, int cantidad, String estado) {
		super();
		this.iddtoc = iddtoc;
		this.idcompra = idcompra;
		this.idordencompra = idordencompra;
		this.idproducto = idproducto;
		this.idMTP = idMTP;
		this.detalle = detalle;
		this.precio = precio;
		this.cantidad = cantidad;
		this.estado = estado;
	}

	public int getIddtoc() {
		return iddtoc;
	}

	public void setIddtoc(int iddtoc) {
		this.iddtoc = iddtoc;
	}

	public int getIdcompra() {
		return idcompra;
	}

	public void setIdcompra(int idcompra) {
		this.idcompra = idcompra;
	}

	public int getIdordencompra() {
		return idordencompra;
	}

	public void setIdordencompra(int idordencompra) {
		this.idordencompra = idordencompra;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public int getIdMTP() {
		return idMTP;
	}

	public void setIdMTP(int idMTP) {
		this.idMTP = idMTP;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
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
