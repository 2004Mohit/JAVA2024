class Program8{
        public static void main(String[] args){
                long num = 256985L;
                long product = 1;
                while(num>0){
                        long rem = num % 10;
                        num /= 10;
                        if(rem % 2 != 0 ){
                                product *= rem;
                        }
                }
                System.out.println("Product of odd digits: " + product);

        }
}
