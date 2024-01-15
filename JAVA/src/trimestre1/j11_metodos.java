package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j11_metodos {
	
	/*****************************************************************************/
	
	public static void multi(double a) {
		

			for(int j =1;j<=10;j++) 
				System.out.printf("%10.2f",a*j);
		System.out.println();
	}
	
/*****************************************************************************/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
/*****************************************************************************/
		//print F
		
		
		int v1=1000;
		double v2=1234.567;
		String v3= "Madrid";
		
		System.out.printf("%-20s %4.2f %5d",v3,v2,v1);
		System.out.println();
		
		String cadena= "HOY LUNES";
		double v4= 12.3456;
		int v5= 123;
		
		String resultante;
		
		resultante=String.format("%-20s %.2f %5d",cadena,v4,v5);
		
		System.out.println(resultante);
		
/*****************************************************************************/
		
		System.out.println("Introduce un numero con decimales");
		double num = Double.parseDouble(lector.readLine());
		
		multi(num);
		multi(123);
		multi(123.12);
		multi(1000.2);
		multi(123.78);
		multi(123.34);
		
	}

}
