package trimestre1;

public class j15_array12 {

	public static void main(String[] args) {
		int[][] array = new int[10][10];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}

	}

}
