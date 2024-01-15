package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j15_array02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		int[] numeros = new int[3];
		int suma = 0;

		System.out.println("dame 3 numeros enteros y los voy a sumar");

		for (int i = 0; i < numeros.length; i++) {
			int a = i + 1;
			System.out.print("numero " + a + ": ");
			int num = Integer.parseInt(lector.readLine());
			numeros[i] = num;
			suma += numeros[i];
		}

		System.out.println("la suma de los 3 numeros es " + suma);

	}

}
