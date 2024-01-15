package trimestre1;

public class j01_variables8 {
	
	/******************************************************************************************/
	/*Casting entre tipos de datos primitivos*/
	
	public static void main(String[] args) {
		
		int vint = 18;
		byte vbyte = 0;
		
		
		vint = (byte) vbyte;
		
		System.out.println("Muestra el casteo tipos de datos primitivos "+vint);
	}

}
