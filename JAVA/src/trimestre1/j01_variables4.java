package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j01_variables4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		double v1;
		double v2;
		double v3;
		
		System.out.print("introduce el primer numero: ");
		v1 = Double.valueOf(lector.readLine());
		
		System.out.print("introduce el segundo numero: ");
		v2 = Double.parseDouble(lector.readLine());
		
		System.out.print("introduce el tercer numero: ");
		v3 = Double.valueOf(lector.readLine());
		
		double res1 = v1*v2*v3;
		double res2 = v1+v2+v3;
		
		System.out.print("las variable multiplicadas dan como resultado: "+res1);
		System.out.println("las variable sumadas dan como resultado: "+res2);
		
		if (v1 > v2) {
			System.out.println("la primer variable ("+v1+") es mayor que la segunda ("+v2+")");
		}
		if (v1==v2 && v1==v3 && v2==v3) {
			System.out.println("las 3 variables son iguales ("+v1+")");
		}
		if (v1 % 2 == 0) {
			System.out.println("la primera variable es multiplo de 2 ("+v1+")");
		}
		
	}

}
