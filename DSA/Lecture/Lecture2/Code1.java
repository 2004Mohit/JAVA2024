class SquareRoot {
	static int sqrt(int num) {
		int val = 0;
		int itr = 0;
		for(int i = 1; i<=num; i++) {
			itr++;
			if(i*i == num) {
				val = i;
				break;
			}
		}
		System.out.println(itr);
		return val;
	}

	public static void main(String[] s) {
		int num = 50;
		int ret = sqrt(num);
		System.out.println(ret);
	}
}
