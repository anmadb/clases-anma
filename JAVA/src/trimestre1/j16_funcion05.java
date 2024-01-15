package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class j16_funcion05 {
	
	public static int tamanioNum(int numero) {
		String longitud= Integer.toString(Math.abs(numero));
		int num = longitud.length();
		
		return num;		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		System.out.println("dime un numero entero y te voy a decir el tanaño");
		int numero = Integer.parseInt(lector.readLine()); 
		int entero = tamanioNum(numero);
		
		System.out.println("el numero de digitos es "+entero);

	}

}
