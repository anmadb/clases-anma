package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j08_ejerswitch5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReader
        BufferedReader reader;
        InputStreamReader stream;
        stream = new InputStreamReader (System.in);
        reader = new BufferedReader (stream);
        
        // variables
        int sueldo = 0;
        int dietas;

        
        // cargo
        System.out.println("Introduzca el cargo del empleado (1 - 3)");
        int cargo = Integer.parseInt(reader.readLine());

        // viajes
        System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
        int viajes = Integer.parseInt(reader.readLine());
        dietas = viajes * 30;

        // estado civil
        System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado):");
        int estado = Integer.parseInt(reader.readLine());
        
        

        //switch
        System.out.println("-------------------------------");
        switch (cargo) {
            case 1->sueldo = 950;
            case 2->sueldo = 1200;
            case 3->sueldo = 1600;
        }
        
        int sueldoBruto = sueldo + dietas;
        double irpf = sueldoBruto * 0.25;
        double irpf2 = sueldoBruto * 0.2;
        double sueldoNeto = sueldoBruto - irpf;
        double sueldoNeto2 = sueldoBruto - irpf2;
        
        System.out.println("|Sueldo base " + sueldo + "|");

        if (viajes > 31) {
            System.out.println("|Numero de viejas incorrecto. Viajes incalculables |");
        } else {
            dietas = viajes * 30;
            System.out.println("|Dietas (" + viajes + " viajes) " + dietas + "|");
        }
        System.out.println("|-----------------------------|");
        System.out.println("|Sueldo bruto " + sueldoBruto + "|");
  
            switch (estado) {
                case 1:
                    System.out.println("|Retención IRPF (25%) " + irpf + "|");
                    System.out.println("|-----------------------------|");
                    System.out.println("|Sueldo neto " + sueldoNeto + "|");
                    System.out.println("-------------------------------");
                    break;
                case 2:
                    System.out.println("|Retención IRPF (20%) " + irpf2 + "|");
                    System.out.println("|-----------------------------|");
                    System.out.println("|Sueldo neto " + sueldoNeto2 + "|");
                    System.out.println("-------------------------------");
                    break;
                default:
                    System.out.println("Estado civil incorrecto. IRPF incalculable ");
                    break;
            }

	}

}
