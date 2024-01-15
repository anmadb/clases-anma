package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j08_ejerswitch3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		
        stream = new InputStreamReader (System.in);
        lector = new BufferedReader (stream);

        System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int valorA = Integer.parseInt(lector.readLine());
        int valorB = 40;
        int valorC = valorA - valorB;
        int valorD = 16;
        int valorE = 12;
        int resultado1 = (valorC*valorD)+(valorB*valorE);
        int resultado2 = valorA*valorE;

        if (valorA >=40) {
                    System.out.println("El sueldo semanal que le corresponde es de: "+ resultado1);
        }else{
                    System.out.println("El sueldo semanal que le corresponde es de: "+ resultado2);
                }

	}

}
