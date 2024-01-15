package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j05_ejerif {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		System.out.print("Dame tu edad: ");
		
		int edad = Integer.parseInt(lector.readLine());
		
		if (edad >= 18) {
			System.out.println("Es mayor de edad.");
			lector.close();
		}	
	}
}
