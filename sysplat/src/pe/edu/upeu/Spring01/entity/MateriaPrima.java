package pe.edu.upeu.Spring01.entity;

public class MateriaPrima {
	
	private int idmatpri;
	private String nombre;
	private double stock;
	private String estado;
	
	public MateriaPrima() {
		super();
	}

	public MateriaPrima(int idmatpri, String nombre, double stock, String estado) {
		super();
		this.idmatpri = idmatpri;
		this.nombre = nombre;
		this.stock = stock;
		this.estado = estado;
	}

	public int getIdmatpri() {
		return idmatpri;
	}

	public void setIdmatpri(int idmatpri) {
		this.idmatpri = idmatpri;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
