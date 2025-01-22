import java.io.*;

class Program7{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
                System.out.print("Enter A Number : ");
                int num = Integer.parseInt(br.readLine());
		int rev = 0;
		int temp = num;
		while(num > 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		   System.out.println("Reverse of "+ temp + " is " +rev);
	
	}
}
