package trimestre1;

public class j01_variables6 {

	/******************************************************************************************/
	/*Casting en operaciones aritméticas*/
	
	public static void main(String[] args) {
		
		double vdouble = 12.5;
		int vint = 33;
		double suma = vint + vdouble;
		int res;
		
		res = (int) suma;
		
		
		System.out.println("Muestra el casteo de operaciones aritméticas "+res);
	}
}
