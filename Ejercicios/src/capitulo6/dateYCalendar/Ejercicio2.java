package capitulo6.dateYCalendar;

import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Se coge la Zona Horaria de Roma
		Calendar ahoraEnRoma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		
		//Se coge la Zona Horaria de Sydney(Australia);
		Calendar ahoraEnSidney = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
		
																//Hora de Roma
		System.out.println("Hora en Roma: " + ahoraEnRoma.get(Calendar.HOUR_OF_DAY)); 
		
																//Hora en sidney
		System.out.println("Hora en Sidney: " + ahoraEnSidney.get(Calendar.HOUR_OF_DAY)); 
		
		System.out.println("La diferencia horaria entre Roma y Sidney es de: " + (ahoraEnRoma.get(Calendar.HOUR_OF_DAY)-ahoraEnSidney.get(Calendar.HOUR_OF_DAY)) + " horas.");

	}

}
