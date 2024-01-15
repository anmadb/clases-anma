package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j16_funcion03 {

	public static int numMenor(int num, int num2) {
		
		if (num < num2) {
			System.out.println(num+" es menor que "+num2);
		}else {
			System.out.println(num2+" es menor que "+num);
		}
		return num;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);
		
		
		System.out.println("dime dos numeros y verificamos el numero menor");
		
		System.out.print("primer numero:");
		int primerNum = Integer.parseInt(lector.readLine());
		
		System.out.print("segundo numero:");
		int segundoNum = Integer.parseInt(lector.readLine());
		
		numMenor(primerNum,segundoNum);
		
	}


}
