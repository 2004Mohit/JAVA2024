class Program3{
        public static void main(String[] args){
                long num = 436780521L;
                while(num>0){
                        long rem = num % 10;
                        num /= 10;
                        if(rem != 0 && rem % 2 == 0 || rem % 3 ==0 ){
                                System.out.print(rem + " ");
                        }
                }
        }
}
