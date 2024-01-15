package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j15_array05 {
	public static void main(String[] args) throws IOException {
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		String[] nombre = new String[5];

		System.out.println("dame 5 nombres");

		for (int i = 0; i < nombre.length; i++) {
			int a = i + 1;
			System.out.print("nombre " + a + ": ");
			String registro = lector.readLine();
			nombre[i] = registro;
		}
		for (int i = nombre.length - 1; i >= 0; i--) {
			System.out.println(nombre[i]);
		}
	}

}
