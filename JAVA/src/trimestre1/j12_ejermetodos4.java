package trimestre1;

public class j12_ejermetodos4 {
	
	public static int aleatorio (int li, int ls) {
		//entre 100 y 200
		
		return(int) (Math.random()*(ls-li+1))+li;
		
	}
/********************************************************************/
	public static void main(String[] args) {
		
		int npar = 0;
		int nimpar = 0;
		int n = 0;
		
		System.out.println("numeros aleatorios");
		for (int i=1; i<=10; i++) {
			n = aleatorio (100,200);
			if (n%2==0) {
				System.out.println(n+" es par");
			}else {
				System.out.println(n+" es impar");
			}
			if (n%2 == 0) {
				npar++;
			}else {
				nimpar++;
			}
		}
		System.out.println("el total de pares es: "+npar);	
		System.out.println("el total de impares es: "+nimpar);
		

	}

}
