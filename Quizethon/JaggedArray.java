class JaggedArray {

	public static void main(String[] s) {
	
		int x = 10;
		double arr[][] = new double[2][];

		arr[0] = new double[3];
		arr[1] = new double[3];

		System.out.println(arr[0][0]);
		System.out.println(System.identityHashCode(x));
	}
}
