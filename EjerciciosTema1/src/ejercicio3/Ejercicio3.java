package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Declaramos la variable num la cual va a almacenar lo que introduzca el usuario asi como la variable resultado
		// la cual valdra para determinar si hay o no que restarle a 7 el resto de la division.
		long num, num2, resultado;
		
		// Creamos el Scanner en la variables read y le asignamos la localización a la de US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// Pedimos al usuario que introduzca dos numeros enteros
		System.out.print("Introduce un numero entero: ");
		num = read.nextLong();
		
		System.out.print("Introduce otro numero entero: ");
		num2 = read.nextLong();
		
		// Dividimos el primer numero por el segundo introducido y obtenemos su resto
		num %= num2;
		
		// Comprobamos si num es igual a 0 ya que si introducimos un numero que ya es multiplo de nuestro segundo numero no tiene sentido 
		// que ese numero sea restado a nuestro segundo numero, simplemente nos deberia imprimir su valor, en caso de no ser 0 si que habria que restarlo.
		resultado = num == 0 ? num : num2 - num;		
		
		// Imprimimos el resultado por pantalla
		System.out.println("Para que sea múltiplo de " + num2 + " hay que sumarle: " + resultado);
		
		// Cerramos el Scanner
		read.close();

	}

}
