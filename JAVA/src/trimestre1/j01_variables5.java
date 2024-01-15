package trimestre1;

public class j01_variables5 {

	/******************************************************************************************/
	/*Casting en un arreglo*/
	
	public static void main(String[] args) {
		
		double [] numeros = {12.6, 45.8, 34.78, 43.99};
		
		int [] arreglo = new int [numeros.length];
		
		System.out.println(arreglo[0] = (int) numeros[0]);
		System.out.println(arreglo[1] = (int) numeros[1]);
		System.out.println(arreglo[2] = (int) numeros[2]);
		System.out.println(arreglo[3] = (int) numeros[3]);
		
	}
}