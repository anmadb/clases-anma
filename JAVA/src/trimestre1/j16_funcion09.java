package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j16_funcion09 {

	public static int invertirNumero(int numero) {
        int invertido = 0;
        
        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        
        return invertido;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		System.out.println("dime un numero y lo invierto");
		int numero = Integer.parseInt(lector.readLine());
        int numeroInvertido = invertirNumero(numero);
        
        System.out.println("el numero " + numero + " invertido es: " + numeroInvertido);
    }

}
