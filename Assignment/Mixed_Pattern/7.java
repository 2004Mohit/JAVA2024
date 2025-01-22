import java.io.*;

class Program7{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                int num = 2;
                for(int i = 1 ; i <= row ; i++){
                 
                        for(int j = i ; j <= row ; j++){
                                        System.out.print(num + " ");
                                        num += 2 ;
                        }
                        System.out.println();

        }
        }
}
