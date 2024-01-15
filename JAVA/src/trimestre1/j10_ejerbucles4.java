package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j10_ejerbucles4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector;
	    InputStreamReader stream;
	       
	       stream = new InputStreamReader (System.in);
	       lector = new BufferedReader (stream);
	       
	        System.out.println("Desde que numero queres la cuenta regresiva?");
	        int maximo = Integer.parseInt(lector.readLine());
	        
	        boolean terminado = true;
	        while (terminado) {
	            
	            for (int start = 1; start <= maximo; start++) {
	                System.out.print(start+" ");
	                if (maximo==1) {
	                   terminado=!terminado;
	                }   
	        }
	            System.out.println("\n");
	            maximo--;
	      } 

	}

}
