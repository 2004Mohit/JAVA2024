import java.io.*;

class Program6{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
                System.out.print("Enter A Number : ");
                int num = Integer.parseInt(br.readLine());
                int fact = 1;
                int temp = num;
                while(num > 0){
                        fact = fact * num;
                        num--;
                }
                         System.out.println("Factorial of " + temp + " is " + fact);
        }
}
