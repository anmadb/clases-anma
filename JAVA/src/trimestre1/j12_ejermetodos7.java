package trimestre1;

public class j12_ejermetodos7 {
	
	public static int aleatorio (int li, int ls) {
		return(int) (Math.random()*(ls-li+1))+li;
	}
/*********************************************************************/
public static boolean bisiesto(int vaño) {
		
		
		if ((vaño%4==0 && vaño%100!=0)||(vaño%400==0)) return true;
		return false;
		
	}
	
/*********************************************************************/

	public static void main(String[] args) {
		
		int n;
		int c=0;
		String cadena;
		
		for (int anos=1; anos<=10; anos++) {
			n= aleatorio (2000,2100);
			
			cadena = String.valueOf(n);
			
			if (!bisiesto (n)) {
				c++;
				cadena +=" *";
			}
			System.out.println(cadena);
		}
		System.out.printf("el numero de no bisiestos es: %5d", c);

	}

}