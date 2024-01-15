package trimestre1;

public class j10_ejerbucles6 {

	public static void main(String[] args) {
		
		for(int inicio = 1000; inicio >= 0; inicio-=50) {
			   System.out.println(inicio);
		  }

		  
			int inicio = 1000;
		  while (inicio >= 0) {
			System.out.println(inicio);
			inicio-=50;
		}
		 
			for(int i =1;i<=10;i++) {
				for(int j =1;j<=10;j++) {
					System.out.printf("%4d",i*j);
				}
				System.out.println();
			}

	}

}
