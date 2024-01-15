package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j05_ejerif2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);

		System.out.print("Dame un numero: ");
		
		int num = Integer.parseInt(lector.readLine());
		
		if (num == 10) {
			System.out.println("El número es 10");
			lector.close();
		}	
	}
}
