package trimestre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j15_array14 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader (System.in);
		lector = new BufferedReader (stream);
		
		
		//declaro variables 
		int[][] cuadrado = new int [3][3];
		int sumaFila=0;
		int sumaCol=0;
		int sumaDiag=0;
		boolean fila = true;
		boolean col = true;
		boolean diag = true;
		
		//inicia el programa
		System.out.println("dame los numeros de un cuadrado magico 3x3 ");		
		
		//pide los numeros de la array
		for (int i = 0; i < cuadrado.length; i++) {
			for (int j = 0; j < cuadrado[i].length; j++) {
				
				System.out.print("numero:");
				cuadrado[i][j] = Integer.parseInt(lector.readLine());
			}
		}
		
		//muestra la array
		for (int i = 0; i < cuadrado.length; i++) {
			for (int j = 0; j < cuadrado[i].length; j++) {
				
				System.out.print(cuadrado[i][j]+" ");
				
			}
			System.out.println();
		}
		
		//verifica por filas si la suma de ellas da 15
		for (int i = 0; i < cuadrado.length; i++) {
			for (int j = 0; j < cuadrado[i].length; j++) {
				sumaFila += cuadrado[i][j];
			}
			System.out.println("fila "+(i+1)+" : "+sumaFila);
			if (sumaFila != 15) {
				fila = false;
			}
			sumaFila=0;
		}
		
		//verifica por columnas si la suma de ellas da 15
		for (int i = 0; i < cuadrado.length; i++) {
			for (int j = 0; j < cuadrado[i].length; j++) {
				sumaCol += cuadrado[j][i];
			}
			System.out.println("columna "+(i+1)+" : "+sumaCol);
			if (sumaCol != 15) {
				col = false;
			}
			sumaCol=0;
		}
		
		//verifica si la diagonal da 15
		for (int i = 0; i < cuadrado.length; i++) {
			for (int j = 0; j < cuadrado[i].length; j++) {
				if (i==j) {
					sumaDiag += cuadrado[i][j];
				}
			}
		}
		System.out.println("diagonal: "+sumaDiag);
		if (sumaDiag != 15) {
			diag = false;
		}
		
		//envia el mensaje de si es o no un cuadrado magico
		if (col == true && fila == true && diag == true){ 
			System.out.println("ES UN CUADRADO MAGICO");
		}else {
			
			System.out.println("NO ES UN CUADRADO MAGICO");
		}
		
	}
}
