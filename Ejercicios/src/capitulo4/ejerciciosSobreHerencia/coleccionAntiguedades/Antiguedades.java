package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Antiguedades {
protected int a�oFabrica;
protected String origen;
protected int precio;

public Antiguedades() {
	super();
}

public Antiguedades(int a�oFabrica, String origen, int precio) {
	super();
	this.a�oFabrica = a�oFabrica;
	this.origen = origen;
	this.precio = precio;
}
@Override
public String toString() {
	return "Antiguedades [a�oFabrica=" + a�oFabrica + ", origen=" + origen + ", precio=" + precio + "]";
}
public int getA�oFabrica() {
	return a�oFabrica;
}
public void setA�oFabrica(int a�oFabrica) {
	this.a�oFabrica = a�oFabrica;
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
