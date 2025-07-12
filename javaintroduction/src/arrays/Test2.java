package arrays;

public class Test2 {

	public static void main(String[] args) {

		int[][] arr1 = {
				{1, 2, 1},
				{9, 7, 2},
				{7, 6, 4}
		};

		int[][] arr2 = {
				{2, 6, 8},
				{0, 1, 3},
				{1, 2, 4}
		};

		// Get the dimensions of the arrays
		int rows = arr1[0].length;
		int cols = arr1[0].length;

		// Create a new 2D array to store the sum
		int[][] sumArray = new int[rows][cols];

		// Add corresponding elements of arr1 and arr2
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sumArray[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		// Print the resulting 2D array
		System.out.println("Sum of the two 2D arrays:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(sumArray[i][j] + " ");
			}
			System.out.println();
		}
	}


}




