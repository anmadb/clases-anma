package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j12_ejermetodo1 {

/***************************************************************************************************/
	//creacion de metodo
	public static void parimpar(int a) {
		
		if (a%2==0) {
			System.out.println(a+" es par");
		}else {
			System.out.println(a+" es impar");
		}

	}
/***************************************************************************************************/
	
	public static void parimpar2(int a) {
		
		String cadena= a%2==0 ? "es par" : "es impar";
		System.out.println(a+" "+cadena );
	}
/***************************************************************************************************/	
	
	public static void bisiesto(int vaño) {
		
		if ((vaño%4==0 && vaño%100!=0)||(vaño%400==0)) {
			System.out.println(vaño+ " bisiesto.");
		}else {
			System.out.println(vaño+ " no bisiseto.");
		}
	}
	
/***************************************************************************************************/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader (stream);
		
		System.out.print("Dime un año ");
		int año = Integer.valueOf(lector.readLine());
		
		bisiesto (año);
		bisiesto (1995);
		bisiesto (2000);
		bisiesto (2023);
		
		parimpar (año);
		parimpar (1995);
		parimpar (2000);
		parimpar (2023);
		
		parimpar2 (año);
		parimpar2 (1995);
		parimpar2 (2000);
		parimpar2 (2023);
    
}

}