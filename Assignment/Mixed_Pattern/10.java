import java.io.*;

class Program10{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter number : ");
                long num = Long.parseLong(br.readLine());

		long rev = 0;
                long rev1 = 0;
                long temp = num;
                while(num > 0){
                        long rem = num % 10;
                        rev = rev * 10 + rem;
                        num = num / 10;
                }
                while(rev > 0){
                        long rem1 = rev % 10;
                        rev1 = rev *10 + rem1;
                        rev /= 10;
		if(rem1 % 2 != 0)
                
                {
                        System.out.print(rem1 * rem1 + ",");

		}
                }
                 
        }
}
