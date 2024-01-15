package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j15_array06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		int[] multi = {1,2,3,4,5,6,7,8,9,10};
		int num;
		

		System.out.println("dame un numero y te doy la tabla de multiplicar hasta el 10");	
		num = Integer.parseInt(lector.readLine());

		for (int i = 0; i < multi.length; i++) {
			int res = num*multi[i];
			System.out.print(res+" ");
		}

	}

}
