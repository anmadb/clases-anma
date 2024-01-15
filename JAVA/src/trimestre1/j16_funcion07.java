package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j16_funcion07 {
	
	public static char verificarChar (char carac) {
		
		if ("aeiouAEIOU".indexOf(carac) != -1) {
			System.out.println("es una vocal");
		}else {
			System.out.println("es una consonante");
		}
		
		return carac;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		System.out.println("dime una letra");
		String cadena = lector.readLine();
		char caracter = cadena.charAt(0);
		verificarChar(caracter);
	}

}
