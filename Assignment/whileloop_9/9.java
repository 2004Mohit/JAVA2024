class Program9{
        public static void main(String[] args){
                long num = 2469185L;
                long sum = 0;
                while(num>0){
                        long rem = num % 10;
                        num /= 10;
                        if(rem % 2 != 0 ){
				rem *= rem; 
                                sum += rem;
                        }
                }
                System.out.println("Sum of square of odd digits: " + sum);

        }
}
