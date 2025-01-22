import java.io.*;

class Program8{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                for(int i =  1; i <= row ; i++){
                        for(int space =1; space <= (i-1) ; space++){
                                System.out.print(" " + "\t");
                        }
                        for(int j = i ; j <= row ; j++){
                                System.out.print(j + "\t");
                 	}
                        System.out.println();
                }
        }
}
