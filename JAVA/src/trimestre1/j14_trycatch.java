package trimestre1;


import java.io.IOException;
import java.util.Scanner;

public class j14_trycatch {

	/*
	 * Ejercicio 1: Captura un Número Entero Escribe un programa en Java que pida al
	 * usuario ingresar un número entero. Utiliza un bloque try-catch para manejar
	 * la posibilidad de que el usuario ingrese un dato no entero.
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese una cadena de texto: ");
            String texto = scanner.nextLine();
            System.out.println("Texto ingresado: " + texto);
        } catch (Exception e) {
            System.out.println("Error al leer la entrada.");
        } finally {
            scanner.close();
        }

	}

}
