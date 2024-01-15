package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j15_array09 {

	public static void main(String[] args) throws IOException {
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		String[] cadena = new String[3];
		String palabra;

		System.out.println("dame 3 palabras");

		for (int i = 0; i < cadena.length; i++) {
			int a = i + 1;
			System.out.print("palabra " + a + ":");
			palabra = lector.readLine();
			cadena[i] = palabra;
		}
		System.out.print(cadena[0] + " " + cadena[1] + " " + cadena[2]);

	}

}
