package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Cuadro extends Antiguedades{
String pintor;
int altura;
int anchura;

public Cuadro(int a�oFabrica, String origen, int precio, String pintor, int altura, int anchura) {
	super(a�oFabrica, origen, precio);
	this.pintor = pintor;
	this.altura = altura;
	this.anchura = anchura;
}

@Override
public String toString() {
	return "Cuadro [pintor=" + pintor + ", altura=" + altura + ", anchura=" + anchura + ", a�oFabrica=" + a�oFabrica
			+ ", origen=" + origen + ", precio=" + precio + "]";
}
}
