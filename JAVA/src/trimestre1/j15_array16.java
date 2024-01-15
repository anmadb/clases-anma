package trimestre1;

public class j15_array16 {

	public static void main(String[] args) {

		int[][] zigzag = new int[4][4];

		for (int i = 0; i < zigzag.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < zigzag[i].length; j++) {
					zigzag[i][j] = j + 1;
				}
			} else {
				for (int j = zigzag.length-1; j > 0; j--) {
					zigzag[i][j] = j;
				}
			}
		}

		for (int i = 0; i < zigzag.length; i++) {
			for (int j = 0; j < zigzag[i].length; j++) {
				System.out.print(zigzag[i][j] + " ");
			}
			System.out.println();
		}

	}

}
