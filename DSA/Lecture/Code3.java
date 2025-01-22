class revArray {
	public static void main(String[] s) {
		int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		int N = 10;
		
		System.out.println("Given Array : ");

		for(int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}

		for(int i = 0; i < N/2; i++) {
				arr[i] = arr[i+1];

		}
		
		System.out.println("Reverse Array : ");

		for(int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}

}
