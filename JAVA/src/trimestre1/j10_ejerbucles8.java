package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ejercicio 2

public class j10_ejerbucles8 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader lector;
        InputStreamReader stream;
        
        stream = new InputStreamReader (System.in);
        lector = new BufferedReader (stream);
        
        int num;
        
        System.out.print("dame un numero: ");
        num = Integer.parseInt(lector.readLine());
        
        System.out.println("las multilplicaciones de "+num+" hasta el 10 son:");
        
        for (int multi = 1; multi <= 10; multi++) {
        	int res = num*multi;
			System.out.print(num+"x"+multi+"="+res+"  ");
		}
	
	}
		
}

