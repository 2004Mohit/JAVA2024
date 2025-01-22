import java.io.*;

class Program1{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
		int num = 1;
                for(int i = 1 ; i <= row ; i++){
                        for(int sp = 1 ; sp <= (row-i) ; sp++){
                                System.out.print(" " + "\t");
                        }
			for(int j = 1 ; j <= i ; j++){
                                System.out.print(num + "\t");
                        	num+=2;
			}
			System.out.println();
		}
	}
}

