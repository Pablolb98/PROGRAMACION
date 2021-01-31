package capitulo06_Recursos.Math;

public class Graficas {

	public static void main(String[] args) {
		double y1;
		double y2;
		double x = 0.001;
		
		do {
			y1 = Math.sqrt(x);
			y2 = -Math.log(x);
			
			x += 0.0001;
			
		} while (Math.abs(y1 - y2) >= 0.001);

		System.out.println("Se corta en el punto: (" + x + " , " + y1 + ")");
		System.out.println("Se corta en el punto: (" + x + " , " + y2 + ")");
	}

}
