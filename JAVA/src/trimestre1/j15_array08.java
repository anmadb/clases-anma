package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j15_array08 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		int[] cadena = new int[7];
		int num = 0;
		int positivos = 0;
		int negativos = 0;

		System.out.println("dame 5 numeros");

		for (int i = 0; i < cadena.length; i++) {
			int a = i + 1;
			System.out.print("numero " + a + ":");
			num = Integer.parseInt(lector.readLine());
			cadena[i] = num;

		}
		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i]<0) {
				negativos ++;
			}else {
				positivos++;
			}
		}
		
		System.out.println("la cantidad de numeros positivos es "+positivos+" "
				+ "y la cantidad de numeros negativos es "+negativos );

	}

}
