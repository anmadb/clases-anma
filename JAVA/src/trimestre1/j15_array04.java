package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j15_array04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		int[] numeros = new int[6];
		int menor = 0;

		System.out.println("dame 6 numeros y te voy a dar el numero menor");

		for (int i = 0; i < numeros.length; i++) {
			int a = i + 1;
			System.out.print("numero " + a + ": ");
			int num = Integer.parseInt(lector.readLine());
			numeros[i] = num;
			menor = numeros[0];
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}

		System.out.print("el menor valor es " + menor);

	}

}
