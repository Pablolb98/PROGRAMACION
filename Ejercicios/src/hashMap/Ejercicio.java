package hashMap;

import java.util.HashMap;

public class Ejercicio {

	public static void crearHashMap() {
		HashMap hm = new HashMap();	
		
		hm.put("1", new Articulo("LimpiaCristal", 2563252, 5, 10));
		hm.put("2", new Articulo("Agua", 7654524, 4, 50));
		hm.put("3", new Articulo("Larios", 4987532, 3, 2));
		
		System.out.println("Mostramos el producto 1 " + hm.get("1"));
		
		hm.put(new Integer("3"), new Articulo("Ron", 231254323, 3, 8));
		
		
		hm.remove("2");
		System.out.println("\nTodos los productos dentro del HashMap:");
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println("Identificador tipo: " + claves[i].getClass().getName() + " - valor: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
		}
		hm.get(7654524);
	}
	
	
	
	public static void main(String[] args) {
		crearHashMap();

	}

}
