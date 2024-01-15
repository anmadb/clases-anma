package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j15_array03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		double[] nota = new double[3];
		double suma = 0;
		double promedio;

		System.out.println("dame 4 notas, voy a sacar el promedio");

		for (int i = 0; i < nota.length; i++) {
			int a = i + 1;
			System.out.print("nota " + a + ": ");
			double num = Double.parseDouble(lector.readLine());
			nota[i] = num;
			suma += nota[i];
		}
		promedio = suma / nota.length;

		System.out.print("el promedio es ");
		System.out.printf("%1.2f", promedio);

	}

}
