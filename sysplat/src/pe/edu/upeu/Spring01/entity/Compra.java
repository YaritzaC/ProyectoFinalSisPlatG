package pe.edu.upeu.Spring01.entity;

public class Compra {
	
	private int idcompra;
	private int idproveedor;
	private int idempleado;
	private int numero;
	private int cantidad;
	private String descuento;
	private double subtotal;
	private double total;
	private String estado;
	
	public Compra() {
		super();
	}

	public Compra(int idcompra, int idproveedor, int idempleado, int numero, int cantidad, String descuento,
			double subtotal, double total, String estado) {
		super();
		this.idcompra = idcompra;
		this.idproveedor = idproveedor;
		this.idempleado = idempleado;
		this.numero = numero;
		this.cantidad = cantidad;
		this.descuento = descuento;
		this.subtotal = subtotal;
		this.total = total;
		this.estado = estado;
	}

	public int getIdcompra() {
		return idcompra;
	}

	public void setIdcompra(int idcompra) {
		this.idcompra = idcompra;
	}

	public int getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
