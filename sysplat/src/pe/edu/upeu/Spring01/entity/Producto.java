package pe.edu.upeu.Spring01.entity;

public class Producto {
	private int idproducto;
	private String nombre;
	private double precio;
	private int stock;
	private String codigo;
	private String estado;

	public Producto() {
		super();
	}

	public Producto(int idproducto, String nombre, double precio, int stock, String codigo, String estado) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.codigo = codigo;
		this.estado = estado;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
