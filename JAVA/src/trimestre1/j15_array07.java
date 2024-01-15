package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j15_array07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		int[] cadena = new int[5];
		int num = 0;
		int num2 = 0;

		System.out.println("dame 5 numeros enteros");

		for (int i = 0; i < cadena.length; i++) {
			int a = i + 1;
			System.out.print("numero " + a + ":");
			num = Integer.parseInt(lector.readLine());
			cadena[i] = num;

		}
		System.out.println("dame otro numero mas");
		num2 = Integer.parseInt(lector.readLine());
		for (int i = 0; i < cadena.length; i++) {
			if (num2 == cadena[i]) {
				System.out.println("el numero esta dentro de la serie de numeros anterior.");
			}
		}

	}

}
