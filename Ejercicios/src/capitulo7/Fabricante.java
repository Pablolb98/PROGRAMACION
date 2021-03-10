package capitulo7;

public class Fabricante {
	int id, cif;
	String nombre;
	
	
	public Fabricante(int id, int cif, String nombre) {
		super();
		this.id = id;
		this.cif = cif;
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCif() {
		return cif;
	}


	public void setCif(int cif) {
		this.cif = cif;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", cif=" + cif + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
