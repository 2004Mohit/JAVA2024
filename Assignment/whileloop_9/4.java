class Program4{
        public static void main(String[] args){
                long num = 256985L;
                while(num>0){
                        long rem = num % 10;
                        num /= 10;
                        if(rem % 2 != 0 ){
                                System.out.print(rem*rem + " ");
                        }
                }
        }
}
