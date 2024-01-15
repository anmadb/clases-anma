package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j14_trycatch2 {

	/*
	 * Ejercicio 3: Conversión de Tipo Escribe un programa que pida al usuario
	 * ingresar un número decimal (tipo double) y luego intente convertirlo a
	 * entero. Maneja cualquier error de formato con try-catch.
	 */

	public static void main(String[] args) throws IOException {

		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		double num;
		int entero;

		System.out.println("decime un numero en decimal y lo vamos a pasar a entero");

		try {
			System.out.print("numero: ");
			num = Double.parseDouble(lector.readLine());
			entero = (int) Math.round(num);
			if (num == entero) {
				System.out.println("ya es entero");
			} else {
				System.out.print("el numero entero es " + entero);
			}

		} catch (NumberFormatException e) {
			System.out.println("no es un numero");
		}finally {
			
		}
		lector.close();

	}

}
