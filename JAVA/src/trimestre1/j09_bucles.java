package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j09_bucles {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br;
        InputStreamReader stream;
        
        stream = new InputStreamReader (System.in);
        br = new BufferedReader (stream);
        
        
        //bucle while
        int numero = 10;
        boolean Terminado = false;
        while(!Terminado){
            System.out.println("Numero: "+numero);
            if (numero == 0) {
                System.out.println("U DIED!!!");
                Terminado = !Terminado;
            }
            numero --;   
        }
        
        //bucle for
        for (int numero1 = 10; numero1 >= 0; numero1--) {
            System.out.println("El numero es: "+numero1);
            if (numero1 == 0) {
                System.out.println("te moriste");
            }
        }
        
        //do while
        int numero2 = 1;
        do {
            System.out.println("el numero es: "+numero2);
            numero2 ++;
            
        } while (numero2 <=10);
        
        //-------------------------------------------------
        int numero3;
        
        do {
            System.out.println("dame un numero");
            numero3 = Integer.parseInt(br.readLine());
        } while (numero3%2 == 0);
        System.out.println("por fin un numero !par");

	}

}
