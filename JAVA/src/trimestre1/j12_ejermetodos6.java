package trimestre1;

public class j12_ejermetodos6 {
	
	public static int aleatorio (int li, int ls) {
		return(int) (Math.random()*(ls-li+1))+li;
	}
/*********************************************************************/
	
	public static void bisiesto(int vaño) {
		
		
		if ((vaño%4==0 && vaño%100!=0)||(vaño%400==0)) {
			System.out.println(vaño+ " bisiesto.");
		}else {
			System.out.println(vaño+ " no bisiseto.");
		}
	}
/*********************************************************************/

	public static void main(String[] args) {
		int bi = 0;
		int nobi = 0;
		int annos = 0;		
		
		System.out.println("Años aleatorios:");
		for (int anos=1; anos<=10; anos++) {
			System.out.print("Año ");
			bisiesto (annos = aleatorio (2000,2100)); 
			if ((annos%4==0 && annos%100!=0)||(annos%400==0)) {
				bi ++;
			}else {
				nobi ++;
			}			
		}
		
		System.out.println();
		System.out.println("total bisiestor: "+bi);
		System.out.println("total no bisiestor: "+nobi);
	}
}
