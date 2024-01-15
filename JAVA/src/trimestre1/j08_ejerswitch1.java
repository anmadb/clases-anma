package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j08_ejerswitch1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader;
        InputStreamReader stream;
        
        stream = new InputStreamReader (System.in);
        reader = new BufferedReader (stream);
        
       
        System.out.println("Introduce el dia de la semana");
        String horario = reader.readLine();
        
        switch (horario) {
            case "lunes" -> System.out.println("primer hora: FOL ");
            case "martes" -> System.out.println("primer hora: Programacion ");
            case "miercoles" -> System.out.println("primer hora: Base de datos ");
            case "jueves" -> System.out.println("primer hora: FOL");
            case "viernes" -> System.out.println("primer hora: Programacion ");
            case "sabado" -> System.out.println("jugar al valo");
            case "domingo" -> System.out.println("jugar al valo");
            default -> System.out.println("dia incorrecto");
            
       
        }
	}

}
