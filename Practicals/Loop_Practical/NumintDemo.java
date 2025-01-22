class NumintDemo {
	public static void main(String[] s) {
		int x = 0;
		while(true) {
			++x;
			if(x%10==9)
				break;
			System.out.println(x);
		}
	}
}
