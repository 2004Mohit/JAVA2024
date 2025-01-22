class Prog2 {
	public static void main(String[] s) {
		int num = 'Z';
		if(true)
		{
			System.out.println(--num + --num + --num + --num);
			num--;
		}
		System.out.println(num);
		if(num<20)
                {
                        num = 'A';
                }

		System.out.println(num);
	}
}
