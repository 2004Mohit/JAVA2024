class IfElseDemo4 {
        public static void main(String[] s) {
                char ch = 97;
                System.out.println(ch); //a

                if(ch=='a') {
                        ch+=3;
                        System.out.println(ch--); //d
                }else{
			System.out.println(ch++);
		}

		System.out.println(ch+=5); //h
        }
}
