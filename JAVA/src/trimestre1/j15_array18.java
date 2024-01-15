package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class j15_array18 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		int[] array = new int[5];

		System.out.println("dame 5 numeros y los voy a mostrar ordenados");

		for (int i = 0; i < array.length; i++) {
			System.out.print("Numero " + (i + 1) + ": ");
			array[i] = Integer.parseInt(lector.readLine());
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
