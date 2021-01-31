package capitulo06_Recursos.Math;

public class Pi {

	public static void main(String[] args) {
		double x = 3;
		float piCalculado = 4;
		int signo = -1;
		do {
		piCalculado += signo * 4.0 / x;
		signo *= -1;
		x += 2;

		} while (Math.abs(Math.PI - piCalculado) >= 0.00001);
		System.out.println(piCalculado);

	}

}
