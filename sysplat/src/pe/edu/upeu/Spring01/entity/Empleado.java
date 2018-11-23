package pe.edu.upeu.Spring01.entity;

public class Empleado {
	
	private int idempleado;
	private int idsede;
	private String user;
	private String password;
	private String nombre;
	private String apellido;
	private String DNI;
	private String tipo;
	private String estado;
	
	public Empleado() {
		super();
	}

	public Empleado(int idsede, String user, String password, String nombre, String apellido, String dNI, String tipo,
			String estado) {
		super();
		this.idsede = idsede;
		this.user = user;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.tipo = tipo;
		this.estado = estado;
	}



	public Empleado(int idempleado, int idsede, String user, String password, String nombre, String apellido, String dNI,
			String tipo, String estado) {
		super();
		this.idempleado = idempleado;
		this.idsede = idsede;
		this.user = user;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.tipo = tipo;
		this.estado = estado;
	}

	public Empleado(int idsede, String user, String password) {
		super();
		this.idsede = idsede;
		this.user = user;
		this.password = password;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public int getIdsede() {
		return idsede;
	}

	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
