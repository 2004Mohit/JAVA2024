class pairSum {
	public static void main(String[] s) {
		int arr[] = new int[]{8,7,5,3,2,6,7};
		int N = arr.length;
		int sum = 0;
		if(N % 2 != 0) {
		for(int i = 0; i < N; i++) {
			if(i != N-1-i) {
				sum = arr[i] + arr[N-1-i];
				System.out.println(sum);
			} else {
				System.out.println(arr[i]);
				break;
			}
		}

		} else {

		for(int i = 0; i < N/2; i++) {

				sum = arr[i] + arr[N-1-i];
				System.out.println(sum);
		}

		}	
	}
}
