package ejercicio8;

//Importamos la libreria Scanner y Locale
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Declaramos dos cosntantes para el precio de las entradas y otra para el descuento aplicable
		final byte PRECIO_ENTRADA_ADULTO = 20;
		final float PRECIO_ENTRADA_INFANTIL = 15.50f;
		final float DESCUENTO = 1.05f;
		
		// Declaramos variables para el precio total y las entradas vendidas
		float precioTotal;
		short entradasAdultos;
		short entradasInfantiles;
		
		// Creamos el Scanner en la variables read y asignamos el formato US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		
		// Pedimos al usuario que nos introduzca cuantas entradas de adulto y de niño se vendieron
		System.out.print("Cuantas entradas de Adulto se han vendido?: ");
		entradasAdultos = read.nextShort();
		
		System.out.print("Cuantas entradas Infantiles se han vendido?: ");
		entradasInfantiles = read.nextShort();
		
		// Cerramos el Scanner
		read.close();

	}

}
