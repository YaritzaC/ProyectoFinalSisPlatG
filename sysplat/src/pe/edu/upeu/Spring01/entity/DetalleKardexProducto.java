package pe.edu.upeu.Spring01.entity;

public class DetalleKardexProducto {

	private int iddetallekardexproducto;
	private int idkardexproducto;
	private int idproducto;
	private double precio;
	private int stockantiguo;
	private int cantidad;
	private int stockactual;
	private String estado;

	public DetalleKardexProducto() {
		super();
	}
	
    // Crear detalle kardex producto
	public DetalleKardexProducto(int idproducto, double precio, int cantidad) {
		super();
		this.idproducto = idproducto;
		this.precio = precio;
		this.cantidad = cantidad;
	}


	public int getIddetallekardexproducto() {
		return iddetallekardexproducto;
	}

	public void setIddetallekardexproducto(int iddetallekardexproducto) {
		this.iddetallekardexproducto = iddetallekardexproducto;
	}

	public int getIdkardexproducto() {
		return idkardexproducto;
	}

	public void setIdkardexproducto(int idkardexproducto) {
		this.idkardexproducto = idkardexproducto;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStockantiguo() {
		return stockantiguo;
	}

	public void setStockantiguo(int stockantiguo) {
		this.stockantiguo = stockantiguo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getStockactual() {
		return stockactual;
	}

	public void setStockactual(int stockactual) {
		this.stockactual = stockactual;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
