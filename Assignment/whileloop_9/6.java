class Program6{
        public static void main(String[] args){
                int num = 234;
		int product=1;
                while(num>0){
                        int rem = num % 10;
                        num /= 10;
			product *= rem;
                }
		 System.out.print(product+ " ");
        }
}
