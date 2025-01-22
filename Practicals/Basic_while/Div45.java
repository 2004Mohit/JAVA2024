class Div45 {
	public static void main(String[] s) {
		int x = 100;
		while(x>=24) {
			if(x%4==0 && x%5==0) {
				System.out.println(x);
			}
			x--;
		}
	}
}
