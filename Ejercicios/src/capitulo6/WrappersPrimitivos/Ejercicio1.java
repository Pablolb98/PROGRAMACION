package capitulo6.WrappersPrimitivos;

public class Ejercicio1 {

	public static void main(String[] args) {
//		Integer integer = new Integer(10);
//		integer = Integer.valueOf(10); // Igual al anterior pero no esta obsoleto
		
		//byte
		System.out.println("Maximo para un byte = " + Byte.MAX_VALUE);
		System.out.println("Minimo para un byte = " + Byte.MIN_VALUE);
		System.out.println("Tamaño de un byte =" + Byte.SIZE);
		
		//Integer
		System.out.println("Maximo de un Integer= " + Integer.MAX_VALUE);
		System.out.println("Minimo de un Integer= " + Integer.MIN_VALUE);
		System.out.println("Tamaño de un integer = " + Integer.SIZE);
		
		//short
		System.out.println("Maximo de un short = " + Short.MAX_VALUE);
		System.out.println("Minimo de un short = " + Short.MIN_VALUE);
		System.out.println("Tamaño de un short = " + Short.SIZE);

		//long
		System.out.println("Maximo de un long = " + Long.MAX_VALUE);
		System.out.println("Minimo de un long = " + Long.MIN_VALUE);
		System.out.println("Tamaño de un long = " + Long.SIZE);
		
		//float
		System.out.println("Maximo de un float = " + Float.MAX_VALUE);
		System.out.println("Minimo de un float = " + Float.MIN_VALUE);
		System.out.println("Tamaño de un float = " + Float.SIZE);
		
		//double
		System.out.println("Maximo de un double = " + Double.MAX_VALUE);
		System.out.println("Minimo de un double = " + Double.MIN_VALUE);
		System.out.println("Tamaño de un double = " + Double.SIZE);
	}
}
