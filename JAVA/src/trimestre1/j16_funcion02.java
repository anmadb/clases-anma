package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j16_funcion02 {
	
	public static int validarNegativo(int num) {
		
		if (num < 0) {
			System.out.println("el numero "+num+" es negativo");
		}else {
			System.out.println("el numero "+num+" es positivo");
		}
		return num;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);
		
		
		System.out.println("dime un numero y verificamos si es negativo");
		
		int negativo = Integer.parseInt(lector.readLine());
		validarNegativo(negativo);
	}

}
