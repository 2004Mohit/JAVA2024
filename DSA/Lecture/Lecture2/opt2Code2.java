class opt2Sqrt {
	static int sqrt(int num) {
		int val = 0;
		int itr = 0;
		for(int i = 1; i*i<=num; i++) {
			itr++;
			if(i*i <= num) {
				val = i;
			} else {
				break;
			}
		}
		System.out.println(itr);
		return val;
	}

	public static void main(String[] s) {
		int num = 81;
		int ret = sqrt(num);
		System.out.println(ret);
	}
}
