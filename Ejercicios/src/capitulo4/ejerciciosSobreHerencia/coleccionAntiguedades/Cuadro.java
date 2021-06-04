package capitulo4.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Cuadro extends Antiguedades{
String pintor;
int altura;
int anchura;

public Cuadro(int añoFabrica, String origen, int precio, String pintor, int altura, int anchura) {
	super(añoFabrica, origen, precio);
	this.pintor = pintor;
	this.altura = altura;
	this.anchura = anchura;
}

@Override
public String toString() {
	return "Cuadro [pintor=" + pintor + ", altura=" + altura + ", anchura=" + anchura + ", añoFabrica=" + anoFabrica
			+ ", origen=" + origen + ", precio=" + precio + "]";
}
}
