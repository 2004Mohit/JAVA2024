class IfElseDemo5 {
        public static void main(String[] s) {
                char ch = 97;
                System.out.println(ch = ch+8); //i

                if(ch=='a') {
                        int x = 5;
                        System.out.println(ch-- + x);
                }else{
			int x = 7;
                        System.out.println(ch++); //i
			System.out.println(x); //7
                }

                System.out.println(ch+=5); //o
        }
}
