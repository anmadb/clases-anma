package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j05_ejerif1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		int temperatura;

		System.out.print("Dame la temperatura: ");
		
		temperatura = Integer.parseInt(lector.readLine());
		
		if (temperatura < 0) {
			System.out.println("Temperatura bajo cero");
		}	
	    	lector.close();
	}
}
