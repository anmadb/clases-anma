package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j14_trycatch4 {
	
	/*
	 * Ejercicio 5: Múltiples Capturas Crea un programa que pida al usuario ingresar
	 * dos números enteros y luego calcule y muestre su suma. Implementa múltiples
	 * bloques catch para manejar diferentes tipos de excepciones que pueden
	 * ocurrir.
	 */
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);
		
		int num1;
		int num2;
		double res;

		System.out.println("decime dos numeros que los vamos a sumar");

		try {
			System.out.print("Numero 1: ");
			num1 = Integer.parseInt(lector.readLine());
			System.out.print("Numero 2: ");
			num2 = Integer.parseInt(lector.readLine());
			res = num1 + num2;
			System.out.println("Resultado: " + res);
		}catch (NumberFormatException e) {
			System.out.println("solo permite numeros enteros");
		} finally {
		}
		lector.close();

	}

}

