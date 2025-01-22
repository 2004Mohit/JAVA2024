import java.io.*;

class Program7{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                for(int i = row ; i >= 1 ; i--){
                        int num = 1;
                        for(int space = 1; space <= (row-i) ; space ++){
                                System.out.print(" " + "\t");
                        }
                        for(int j = 1 ; j <= i ; j++){
                                System.out.print(num + "\t");
                                num++;
                        }
                        System.out.println();
                }
        }
}
