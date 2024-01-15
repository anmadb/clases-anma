package trimestre1;

import java.util.Scanner;

public class j05_if {

	public static void main(String[] args) {
	
		try (Scanner escaner = new Scanner(System.in)) {
			System.out.println("Introduce el dia de la semana");
			int nextInt = escaner.nextInt();
			
			if (nextInt == 0){
			    System.out.println("es lunes");
			}else if (nextInt == 1){
			    System.out.println("es martes");
			}else if (nextInt == 2){
			    System.out.println("es miercoles");
			}else if (nextInt == 3){
			    System.out.println("es jueves");
			}else if (nextInt == 4){
			    System.out.println("es viernes");
			}else if (nextInt == 5){
			    System.out.println("es sabado");   
			}else if (nextInt == 6){
			    System.out.println("es domigo");
			}else {
			    System.out.println("numero incorrecto");
			}
		}

	}

}
