package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j15_array17 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		int[][] buscaNum = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		boolean dentro = false;

		do {

			System.out.println("dame un puto numero");
			System.out.println("el puto numero: ");
			int num = Integer.parseInt(lector.readLine());
			for (int i = 0; i < buscaNum.length; i++) {
				for (int j = 0; j < buscaNum[i].length; j++) {
					if (buscaNum[i][j] == num) {
						System.out.println("el numero esta en la array, pedazo de mierda");
						dentro = true;
					}
				}
			}
		} while (dentro == false);
	}
}
