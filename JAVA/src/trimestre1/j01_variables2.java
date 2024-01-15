package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j01_variables2 {

	public static void main(String[] args) throws IOException {
		BufferedReader lector;
        InputStreamReader stream;
        
        stream = new InputStreamReader (System.in);
        lector = new BufferedReader (stream);
        
        String nombreEstudiante;
        int calificacion3;
        int calificacion4;
        double promedioCalificaciones;

        
        System.out.println("Nombre el estudiante");
        nombreEstudiante = lector.readLine();
        
       
        System.out.println("Dame la calificacion numerica de mates: ");
        calificacion3 = Integer.parseInt(lector.readLine());
        System.out.println("Dame la calificacion numerica de historia: ");
        calificacion4 = Integer.parseInt(lector.readLine());

        promedioCalificaciones = (calificacion3 + calificacion4)/2;
        
        System.out.println("El promedio de "+nombreEstudiante+" es: "+promedioCalificaciones);
        
        if(promedioCalificaciones >= 70) {
        	System.out.println("APROBADO");
        }else {
        	System.out.println("DESAPROBADO");
        }

	}

}
