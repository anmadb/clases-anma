package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j16_funcion04 {
	
	public static void bisiesto(int vaño) {
		
		if ((vaño%4==0 && vaño%100!=0)||(vaño%400==0)) {
			System.out.println(vaño+ " bisiesto.");
		}else {
			System.out.println(vaño+ " no bisiseto.");
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		System.out.println("dime un año y te digo si es bisiesto o no");
		int anno = Integer.parseInt(lector.readLine());
		bisiesto(anno);

	}

}
