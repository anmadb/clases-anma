package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j03_ejerBufferedReader1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*ejercicio basico 3
		En este ejercicio, se te pide crear un programa en Java que convierta una temperatura
		 en grados Celsius a grados Fahrenheit.*/
		
		BufferedReader lector;
		InputStreamReader stream;
		
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		int temperaturaCelsius;
		int temperaturaFahrenheit;
		
		System.out.println("dame la temperatura en celcius: ");
		
		temperaturaCelsius = Integer.parseInt(lector.readLine());
		temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
		
		System.out.println("la temperatira en fahrenheit es: "+temperaturaFahrenheit+"\n");
		
		System.out.println("________________________________________________________________\n");
		
		/********************************************************************************************/
		/*ejercicio intermedio 1 En este ejercicio, debes escribir un programa que use `BufferedReader`
		 *  para leer el nombre del usuario desde la entrada estándar (teclado) y luego imprima un saludo
		 *   personalizado en la consola con el nombre proporcionado. */
		
	    String nombre;
	    
		System.out.println("como te llamas?");
		
		nombre = lector.readLine();
		
		System.out.println("buenos dias "+nombre+"\n");
		
		System.out.println("________________________________________________________________\n");
		
		/********************************************************************************************/
		/*ejercicio intermedio 2 Crea un programa que solicite al usuario que ingrese dos números 
		 * enteros usando `BufferedReader`. Luego, suma estos dos números y muestra el resultado 
		 * en la consola.  */
		
		int n1;
		int n2;
		int resultado;
		
		System.out.println("voy a sumar las dos variable que me des");
		System.out.println("dame la primera variable: ");
		
		n1 = Integer.parseInt(lector.readLine());
		
		System.out.println("dame la segunda variable: ");
		
		n2 = Integer.parseInt(lector.readLine());
		
		resultado = n1 + n2;
		
		System.out.println("la suma de las dos variables es: "+ resultado+"\n");
		
		System.out.println("________________________________________________________________\n");
		
		/********************************************************************************************/
		/*ejercicio intermedio 3 Escribe un programa que permita al usuario ingresar una cantidad 
		 * en dólares estadounidenses utilizando `BufferedReader`. Luego, convierte esta cantidad a 
		 * otra moneda (por ejemplo, euros o pesos) utilizando un factor de conversión que definas en 
		 * el programa. Muestra el resultado de la conversión en la consola.  */
		
		float dolares;
		float convEuro;
		
		System.out.println("cuantos dolares tienes?");
		
		dolares = Float.parseFloat(lector.readLine());
		
		convEuro = (float) (dolares * 0.94);
		
		System.out.println("al cambio de hoy le daremos: "+convEuro+" EUROS");
		
		
		
	}

}
