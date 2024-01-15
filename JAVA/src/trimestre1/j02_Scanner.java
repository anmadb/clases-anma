package trimestre1;

import java.util.Scanner;

public class j02_Scanner {

	public static void main(String[] args) {

		Scanner escan = new Scanner(System.in);

		int numero_introducido;

		System.out.println("Introduce un numero entero: ");
		numero_introducido = escan.nextInt();

		System.out.println("El numero introducido es: " + numero_introducido);
		if (numero_introducido == 2) {
			System.out.println("no juegues al lol");
		}
		
		escan.close();

	}

}
