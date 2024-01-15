package trimestre1;

import java.util.Scanner;

public class j01_variables3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		// nombre del estudiante
		System.out.print("Ingrese el nombre del estudiante: ");
		String nombreEstudiante = scanner.nextLine();
			        
		// calificaciones
		System.out.print("Ingrese la calificación 1 (carácter): ");
		char calificacion1 = scanner.next().charAt(0);
			 
		System.out.print("Ingrese la calificación 2 (carácter): ");
		char calificacion2 = scanner.next().charAt(0);
			 
		System.out.print("Ingrese la calificación 3 (entero): ");
		int calificacion3 = scanner.nextInt();
			 
		System.out.print("Ingrese la calificación 4 (entero): ");
		int calificacion4 = scanner.nextInt();
			 
			       
		scanner.close();
			 
		double promedioCalificaciones = (calificacion3 + calificacion4) / 2.0;
		String resultado = (promedioCalificaciones >= 70) ? "Sí" : "No";
			 
		System.out.println("Nombre del estudiante: " + nombreEstudiante);
		System.out.println("Calificación 1: " + calificacion1);
		System.out.println("Calificación 2: " + calificacion2);
		System.out.println("Calificación 3: " + calificacion3);
		System.out.println("Calificación 4: " + calificacion4);
		System.out.println("Promedio de calificaciones: " + promedioCalificaciones);
		System.out.println("¿El estudiante aprobó? " + resultado);

	}

}
