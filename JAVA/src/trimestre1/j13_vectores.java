package trimestre1;

public class j13_vectores {

	public static void main(String[] args) {
		
		String meses[]= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};		
		
		System.out.println(meses.length);
		
		for (int i=0; i<meses.length;i++) 
			System.out.println(i+" "+meses[i]);
		
		int tb []= {45,100,300};
		
		tb[0]=tb[0] + 3145;
		
		for (int i=0; i<tb.length;i++) 
			System.out.println(i+" "+tb[i]);
			
	}

}
