package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j14_trycatch3 {

	/*
	 * Ejercicio 4: Captura de Cadena Desarrolla un programa que solicite al usuario
	 * ingresar una cadena de texto. Usa un bloque try-catch para manejar cualquier
	 * error de entrada.
	 */

	public static void main(String[] args) throws IOException {

		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		String frase;
		System.out.println("escribe lo que quieras");

		try {
			frase = lector.readLine();

			if (frase.matches("[a-zA-Z\\s]+")) {
				System.out.println("felicidades, la frase es " + frase);
			} else {
				throw new Exception();
			}

		} catch (Exception e) {
			System.out.println("solo letras por favor.");
		} finally {

		}
		lector.close();

	}

}
