package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class j07_switch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		
        stream = new InputStreamReader (System.in);
        lector = new BufferedReader (stream);
        
        System.out.println("Introduce el dia de la semana");
        int diasemana = Integer.parseInt(lector.readLine());
        
        switch (diasemana) {
            case 0:
                System.out.println("es lunes");
                break;
            case 1:
                System.out.println("es martes");
                break;
            case 2:
                System.out.println("es miercoles");
                break;
            case 3:
                System.out.println("es jueves");
                break;
            case 4:
                System.out.println("es viernes");
                break;
            case 5:
                System.out.println("es sabado");
                break;
            case 6:
                System.out.println("es domigo");
                break;
            default:
                System.out.println("numero incorrecto");
                break;
        }

	}

}
