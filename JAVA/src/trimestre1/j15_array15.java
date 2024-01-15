package trimestre1;

public class j15_array15 {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };
		int[][] array2 = new int[3][3];

		System.out.println("Array 1");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array2[i][j] = array[j][i];
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Array 2");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}

	}
}
