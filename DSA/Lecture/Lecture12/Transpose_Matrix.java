class Transpose {
	public static void main(String[] s) {
		int arr[][] = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int N = arr.length;

		System.out.println("\nBefore Matrix : ");
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + "	");
			}
			System.out.println();
		}

		for(int i = 0; i < N; i++) {
			for(int j = i; j < N; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		System.out.println("\n\nAfter Matrix : ");
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + "	");
			}
			System.out.println();
		}
	}
}
