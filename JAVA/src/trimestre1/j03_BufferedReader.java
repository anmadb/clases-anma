package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j03_BufferedReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br;
        InputStreamReader stream;
        
        stream = new InputStreamReader (System.in);
        br = new BufferedReader (stream);
       
        
        System.out.println("Introduce un numero entero");
        int a;
        a = Integer.parseInt(br.readLine());
        System.out.println("El numero introducido es: "+a);
        
        if (a%2 == 0){
            System.out.println("es par");
        }else{
               System.out.println("es impar"); 
                }

	}

}
