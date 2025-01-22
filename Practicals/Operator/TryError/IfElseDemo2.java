class IfElseDemo2 {
        public static void main(String[] s) {
                int num = 'Z';
                if(true) {
                        System.out.println(--num + --num + --num + --num); //350
			num--;
                }

                System.out.println(num); //85

                if(num<20) {
                        num = 'A';
                }

                System.out.println(num); //85
        }
}
