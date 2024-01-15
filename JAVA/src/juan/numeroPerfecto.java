package juan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numeroPerfecto {

	public static int perfecto(int num) {
		int numero = num;
		int suma = 0;
		for (int i = 1; i < numero; i++) { 
            if (numero % i == 0) {
                suma += i;  
            }
        }
        if (suma == numero) {                     
            System.out.println(num+" Perfecto");
        } 
		return suma;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		System.out.println("hasta que numero hacemos perfector");
		int num = Integer.parseInt(lector.readLine());
		for (int i = 1; i < num; i++) {
			
			perfecto(i);
		}

	}

}
