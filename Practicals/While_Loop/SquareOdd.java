class SquareOdd {
	public static void main(String[] s) {
		int Start = 150;
		int End = 200;
		int Sq = 0;
		while(Start<=End) {
			Sq = Start * Start;
			if(Sq%2!=0) {
				System.out.print(Start+" ");
			}
			Start++;
		}
		System.out.println();
	}
}
