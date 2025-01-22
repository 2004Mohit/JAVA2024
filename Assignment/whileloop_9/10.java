class Program10{
        public static void main(String[] args){
                long num = 9367924L;
                long sum = 0;
		long product = 1;
                while(num>0){
                        long rem = num % 10;
                        num /= 10;
                        if(rem % 2 != 0 ){
                                sum += rem;
                        }
			else{
				product *= rem;
			}
                }
                
		System.out.println("Sum of even digits: " + sum);
		System.out.println("Product of odd digits: " + product);
        }
}
