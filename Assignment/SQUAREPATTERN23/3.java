import java.io.*;

class Program3{
        public static void main(String[] args)throws IOException{
                BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                int num = row;

                for(int i = 1 ; i <= row ; i++){
                        for(int j = 1 ; j <= row ; j++){
                                if((i + j) % 2 != 0){
                                        System.out.print(num + "\t");
                                }
                                else{
                                        System.out.print((char)(96 + num) + "\t");
                                }
                                num++;
                        }
                        System.out.println();
                }
	}
}
