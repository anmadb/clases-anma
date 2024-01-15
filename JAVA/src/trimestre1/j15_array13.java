package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j15_array13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		double[][] array = new double [5][5];
		double nota = 0;
		double promedio = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Nota alumno numero "+(i+1));
			double promedioAlum = 0;
			for (int j = 0; j < array[i].length; j++) {
				
				System.out.print("Nota "+(j+1)+":");
				nota = Double.parseDouble(lector.readLine());
				promedio += nota;
				promedioAlum += nota;
			}
			promedioAlum = promedioAlum / array.length;
			System.out.println("El promedio del alumno numero "+(i+1)+" es: "+promedioAlum );
		}
		promedio = promedio / (array.length*array.length);
		System.out.println("El promedio  general es: "+promedio);
	}

}
