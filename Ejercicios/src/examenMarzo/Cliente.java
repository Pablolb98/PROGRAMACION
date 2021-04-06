package examenMarzo;

public class Cliente {

	private int id;
	private String nombre, apellidos, localidad, dniNie, email;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nombre, String apellidos, String localidad, String dniNie, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.dniNie = dniNie;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", localidad=" + localidad
				+ ", dniNie=" + dniNie + ", email=" + email + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getDniNie() {
		return dniNie;
	}

	public void setDniNie(String dniNie) {
		this.dniNie = dniNie;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
