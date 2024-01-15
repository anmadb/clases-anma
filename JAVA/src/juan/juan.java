package juan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class juan {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		int lineas = 0;

		System.out.println("dame un numero y escribire un piramide");
		lineas = Integer.parseInt(lector.readLine());

		for (int i = 0; i < lineas; i++) {

			System.out.println();

			for (int j = 0; j <= i; j++) {

				System.out.print("*");
			}
		}
		/**************************************************************************/
		int numeros = 0;
		int acumulador = 0;

		System.out.println("dame numeros y los voy sumando hasta que pongas -1");

		do {
			System.out.print("numero:");
			numeros = Integer.parseInt(lector.readLine());
			acumulador += numeros;

		} while (numeros != -1);

		System.out.println("la suma de todos los numeros es " + (acumulador + 1));

		/**************************************************************************/

		int numImpar = 0;
		int[] acumuladorImpar = new int[8];

		System.out.println("dame 8 numeros");

		for (int i = 0; i < acumuladorImpar.length; i++) {
			System.out.print("numero: ");
			numImpar = Integer.parseInt(lector.readLine());
			acumuladorImpar[i] = numImpar;
		}

		System.out.println("Estos son los numeros impares de la lista");

		for (int i = 0; i < acumuladorImpar.length; i++) {
			if (acumuladorImpar[i] % 2 != 0) {
				System.out.print(acumuladorImpar[i] + " ");
			}
		}
		System.out.println();

		/**************************************************************************/

		System.out.println("dame un numero y te digo si es perfecto");
		int num2 = Integer.parseInt(lector.readLine());
		perfecto(num2);

		}

		public static int perfecto(int num) {
		int numero = 0;
		int suma = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				suma += i;
			}
		}
		if (suma == numero) {
			System.out.println("Perfecto");
		} else {
			System.out.println("No es perfecto");

		}
		return suma;
	}
}
