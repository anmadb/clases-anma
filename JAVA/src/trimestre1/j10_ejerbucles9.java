package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ejercicio 1

public class j10_ejerbucles9 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader lector;
		InputStreamReader stream;

		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		int positivo = 0;
		int contador = 0;

		while (positivo >= 0) {
			System.out.println("Dame un numero, el proceso se para cuando me des un numero negativo.");
			positivo = Integer.parseInt(lector.readLine());
			if (positivo >= 0)
				contador++;
		}
		System.out.println("el total de numeros positivos fue: " + contador);

	}

}
