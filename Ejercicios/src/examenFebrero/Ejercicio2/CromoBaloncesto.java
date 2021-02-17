package examenFebrero.Ejercicio2;

public class CromoBaloncesto {
	
	Integer id;
	String nombre;
	Integer puntosPasados;
	Integer rebotesPasados;
	
	public CromoBaloncesto(Integer id, String nombre, Integer puntosPasados, Integer rebotesPasados) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puntosPasados = puntosPasados;
		this.rebotesPasados = rebotesPasados;
	}

	@Override
	public String toString() {
		return "CromoBaloncesto [id=" + id + ", nombre=" + nombre + ", puntosPasados=" + puntosPasados
				+ ", rebotesPasados=" + rebotesPasados + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntosPasados() {
		return puntosPasados;
	}

	public void setPuntosPasados(Integer puntosPasados) {
		this.puntosPasados = puntosPasados;
	}

	public int getRebotesPasados() {
		return rebotesPasados;
	}

	public void setRebotesPasados(Integer rebotesPasados) {
		this.rebotesPasados = rebotesPasados;
	}
	
	
}
