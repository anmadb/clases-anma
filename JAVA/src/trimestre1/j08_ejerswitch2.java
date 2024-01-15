package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class j08_ejerswitch2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		
        stream = new InputStreamReader (System.in);
        lector = new BufferedReader (stream);
        
        System.out.println("Introduce el dia de la semana");
        int num = Integer.parseInt(lector.readLine());
        
        switch (num) {
            case 0 -> System.out.println("es lunes");
            case 1 -> System.out.println("es martes");
            case 2 -> System.out.println("es miercoles");
            case 3 -> System.out.println("es jueves");
            case 4 -> System.out.println("es viernes");
            case 5 -> System.out.println("es sabado");
            case 6 -> System.out.println("es domigo");
            default -> System.out.println("numero incorrecto");
        }

	}

}
