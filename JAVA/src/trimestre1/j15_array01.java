package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j15_array01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		System.out.println("dame 5 numeros enteros");
		
		System.out.print("numero 1: ");
		int num = Integer.parseInt(lector.readLine());
		System.out.print("numero 2: ");
		int num1 = Integer.parseInt(lector.readLine());
		System.out.print("numero 3: ");
		int num2 = Integer.parseInt(lector.readLine());
		System.out.print("numero 4: ");
		int num3 = Integer.parseInt(lector.readLine());
		System.out.print("numero 5: ");
		int num4 = Integer.parseInt(lector.readLine());

		int [] numeros = new int[5];
		numeros[0]=num;
		numeros[1]=num1;
		numeros[2]=num2;
		numeros[3]=num3;
		numeros[4]=num4;
		
		
		for (int i = 0; i < numeros.length; i++) {		
			System.out.println(numeros[i]);
		}
	

	}

}
