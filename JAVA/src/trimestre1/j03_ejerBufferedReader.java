package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j03_ejerBufferedReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		String frase;
		int longitud;
		
		System.out.print("Escribe una frase: ");
		
		frase = String.valueOf(lector.readLine());
		longitud = frase.length();
		
		System.out.println("La longitud del texto es: "+ longitud);
		
		

	}

}
