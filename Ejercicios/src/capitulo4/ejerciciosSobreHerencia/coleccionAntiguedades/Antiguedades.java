package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Antiguedades {
protected int anoFabrica;
protected String origen;
protected int precio;

public Antiguedades() {
	super();
}

public Antiguedades(int anoFabrica, String origen, int precio) {
	super();
	this.anoFabrica = anoFabrica;
	this.origen = origen;
	this.precio = precio;
}
@Override
public String toString() {
	return "Antiguedades [a�oFabrica=" + anoFabrica + ", origen=" + origen + ", precio=" + precio + "]";
}
public int getAnoFabrica() {
	return anoFabrica;
}
public void setAnoFabrica(int anoFabrica) {
	this.anoFabrica = anoFabrica;
}
public String getOrigen() {
	return origen;
}
public void setOrigen(String origen) {
	this.origen = origen;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}

}
