package trimestre1;

public class j12_ejermetodos5 {
	
/*********************************************************************/	
	
	public static int aleatorio (int li, int ls) {
		//1 a 10
		return(int) (Math.random()*(ls-li+1))+li;
	}
	
/*********************************************************************/

	
	public static String calificaciones (double n){

        String cadena="fuera de rango";
        if (n>=0 && n<5){
            cadena="suspendido";
        }else if (n<6){
            cadena="aprobado";
        }else if (n<7){
            cadena="bien";
        }else if(n<9){
            cadena="notable";
        }else if(n<=10){
            cadena="sobresaliente";
        }
        return cadena;
    }
	
/*********************************************************************/

	public static void main(String[] args) {
		
		int sus = 0,apr = 0,bien = 0,not = 0,sob = 0;
		int nota = 0;
		int suma = 0;
		int promedio = 0;
	
		System.out.println("numeros aleatorios\n");
		
		for ( int alu=1; alu<=25; alu++) {
			nota = aleatorio (0,10);
			suma = suma+nota;
			promedio = suma/alu;
			
			if (nota>=0 && nota<5){
				sus++;
	        }else if (nota<6){
	        	apr++;
	        }else if (nota<7){
	        	bien++;
	        }else if(nota<9){
	        	not++;
	        }else if(nota<=10){
	        	sob++;
	        }
			System.out.println("alumno "+alu+": "+nota+" "+calificaciones (nota));
	    }
		
		System.out.println();
		System.out.println("el promedio de la clase es: "+promedio+"\n");
		System.out.println("total suspensos: "+sus);
		System.out.println("total aprobados: "+apr);
		System.out.println("total bienes: "+bien);
		System.out.println("total notables: "+not);
		System.out.println("total sobresalientes: "+sob);
		
	}

}

