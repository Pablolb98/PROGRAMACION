package hashMap;

public class Articulo {
	String nombre;
	int codBarras, numEstante, unidadesStock;
	
	
	public Articulo(String nombre, int numEstante, int unidadesStock) {
		super();
		this.nombre = nombre;
		this.numEstante = numEstante;
		this.unidadesStock = unidadesStock;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEstante() {
		return numEstante;
	}


	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}

	

	public int getUnidadesStock() {
		return unidadesStock;
	}


	public void setUnidadesStock(int unidadesStock) {
		this.unidadesStock = unidadesStock;
	}


	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", numEstante=" + numEstante
				+ ", unidadesStock=" + unidadesStock + "]";
	}


	
	
	
}
