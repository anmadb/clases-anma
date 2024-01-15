package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j05_ejerif6 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		
		int nota;
		
		System.out.println("dame la nota pendejo de mierda");
		nota = Integer.parseInt(lector.readLine());
		
		if (nota < 50) {
			System.out.println("sos retrasado mental");
		}else {
			System.out.println("seguis siendo retrasado");
		}
		
		
	}
}
