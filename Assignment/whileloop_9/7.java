class Program7{
        public static void main(String[] args){
                long num = 216985L;
		long sum = 0;
                while(num>0){
                        long rem = num % 10;
                        num /= 10;
                        if(rem % 2 == 0 ){
                                sum += rem;
                        }
		}
		System.out.println("Sum of even digits: " + sum);
                
        }
}
