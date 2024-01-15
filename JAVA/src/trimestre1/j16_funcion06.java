package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j16_funcion06 {
	
	public static int calcularMCD(int numero1, int numero2) {
        while (numero2 != 0) {
            int temp = numero2;
            numero2 = numero1 % numero2;
            numero1 = temp;
        }
        return numero1;
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		System.out.println("dime dos numeros y verificamos el MCD");
		
		System.out.print("primer numero:");
		int primerNum = Integer.parseInt(lector.readLine());
		
		System.out.print("segundo numero:");
		int segundoNum = Integer.parseInt(lector.readLine());
		
		int mcd = calcularMCD(primerNum,segundoNum);
		
		 System.out.println("El MCD de " + primerNum + " y " + segundoNum + " es: " + mcd);
		
		
		

	}

}
