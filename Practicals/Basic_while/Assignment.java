class Assignment {
	public static void main(String[] s) {
		int x = 7;
		while(x>=0) {
			if(x==0)
				System.out.println(x+" Days Assignment is OverDue");
			else
				System.out.println(x+" Days Remaining");
			x--;
		}
	}
}
