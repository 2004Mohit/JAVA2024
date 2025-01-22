import java.io.*;

class Program2{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                int num = 1;
                for(int i = 1 ; i <= row ; i++){
                        for(int sp = 1 ; sp <= (i-1) ; sp++){
                                System.out.print(" " + "\t");
                        }
                        for(int j = 1 ; j <= (row-i+1) ; j++){
                                System.out.print(num + "\t");
                                num++;
                        }
			num -= 1;
                        System.out.println();
                }
        }
}
