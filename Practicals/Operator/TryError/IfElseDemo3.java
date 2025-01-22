class IfElseDemo3 {
        public static void main(String[] s) {
                int num = 'Z'+32;
		System.out.println(num); //122

                if(num>'Z') {
                        num/=2;
			num-=30;
			System.out.println(~num); //-32
		}
                System.out.println(num); //31
        }
}
