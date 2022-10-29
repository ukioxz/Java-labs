/* 0402
C5 = 2; C = A+B
C7 = 3 int
C11 = 6 ќбчислити суму найб≥льших елемент≥в
в стовпц€х матриц≥ з парними номерами та найменших
елемент≥в в стовпц€х матриц≥ з непарними номерами*/

public class Lab2 {
	public static void main(String[] args) {
		int[][] matrixA = { 
				{ 1, 2, 5, 0 }, 
				{ 4, 0, 9, 3 }, 
				{ 2, 0, 1, 0 }, 
				{ 6, 7, 1, 2 } 
		};

		int[][] matrixB = { 
				{ 0, 5, 9, 0 }, 
				{ 8, 0, 3, 1 }, 
				{ 4, 6, 7, 1 }, 
				{ 1, 3, 1, 5 } 
		};
		
		int matrixC[][] = new int[4][4];

		int sumMin = 0;
		int sumMax = 0;

		if (matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length) {
			System.out.println("Matrix addition:");
			for (int i = 0; i < matrixA.length; i++) {
				for (int j = 0; j < matrixB.length; j++) {
					matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
					System.out.print(matrixC[i][j] + "\t");
				}
				System.out.println();
			}

			for (int j = 1; j < matrixC[0].length; j += 2) {
				int max = matrixC[0][j];
				for (int i = 0; i < matrixC.length; i++) {
					if (matrixC[i][j] > max) {
						max = matrixC[i][j];
					}
				}
				sumMax += max;
			}
			System.out.println("Sum max:" + sumMax);
			for (int j = 0; j < matrixC[0].length; j += 2) {
				int min = matrixC[0][j];
				for (int i = 0; i < matrixC.length; i++) {
					if (matrixC[i][j] < min) {
						min = matrixC[i][j];
					}
				}
				sumMin += min;
			}
			System.out.println("Sum min:" + sumMin);
		} else {
			System.out.println("Matrices must be the same size");
		}
	}
}
