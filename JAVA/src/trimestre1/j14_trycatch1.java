package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j14_trycatch1 {

	/*
	 * Ejercicio 2: División por Cero Crea un programa que pida al usuario dos
	 * números y luego muestre el resultado de su división. Usa try-catch para
	 * manejar cualquier división por cero.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		int num1;
		int num2;
		double res;

		System.out.println("decime dos numeros que los vamos a dividir");

		try {
			System.out.print("Numero 1: ");
			num1 = Integer.parseInt(lector.readLine());
			System.out.print("Numero 2: ");
			num2 = Integer.parseInt(lector.readLine());
			res = num1 / num2;
			System.out.println("Resultado: " + res);
		} catch (ArithmeticException e) {
			System.out.println("el divisor no puede ser 0");
		} catch (NumberFormatException e) {
			System.out.println("solo permite numeros enteros");
		} finally {
		}
		lector.close();

	}

}
