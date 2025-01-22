import java.io.*;

class Program5{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                for(int i = 1 ; i <= row ; i++){
                                int num = i;
                        for(int space = 1; space <= (row-i) ; space ++){
                                System.out.print(" " + "\t");
                        }
                        for(int j = 1 ; j <= i ; j++){
                                System.out.print(num + "\t");
                                num += i ;
                        }
                        System.out.println();
                }
        }
}
