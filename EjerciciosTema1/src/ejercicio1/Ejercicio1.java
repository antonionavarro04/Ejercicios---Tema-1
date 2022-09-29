package ejercicio1;

import java.util.Locale;
// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaramos el numero a redondear, al ser un numero con decimales va a ser double o float..
		double num;
		
		// Creamos la variable para poder utilizar el Scanner y cambiamos su formato al Formato US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// Pedimos al usuario que introduzca un numero con decimales
		System.out.print("Introduce un numero con decimales: ");
		num = read.nextDouble();
		
		// Sumamos 0.5 a nuestro numero para que de esta manera nos devuelva el numero entero al cual se encuentra mas cerca.
		num += 0.5d;
		
		// Imprimimos el resultado por pantalla cambiandolo al tipo int
		System.out.println("El numero redondeado es: " + (int) num);
		
		// Cerramos el Scanner
		read.close();
		

	}

}
