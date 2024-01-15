package trimestre1;

public class j15_array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int inicio = 0;
		while (inicio < array.length) {
			System.out.println(array[inicio]);
			inicio++;
		}

		/*********************************************************************/

		String[] ciudades = { "Buenos Aires", "Venado Tuerto", "Madrid" };

		for (int i = 0; i < ciudades.length; i++) {
			System.out.println(ciudades[i]);
		}

		/*********************************************************************/

		double[] decimales = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		double suma = 0;

		for (int i = 0; i < decimales.length; i++) {
			suma += decimales[i];

		}
		System.out.println(suma);

		/*********************************************************************/

		int[][] punto = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 },
				};

		for (int i = 0; i < punto.length; i++) {
			for (int j = 0; j < punto[i].length; j++) {

				System.out.println(punto[i][j]);
			}
		}

		/*********************************************************************/

		boolean[] buleanos = new boolean[5];

		int i = 0;

		while (i < buleanos.length) {
			buleanos[i] = true;

			System.out.println(buleanos[i]);
			i++;

		}

	}
}