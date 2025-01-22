import java.io.*;

class Program2{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
		int num = row;
                for(int i = 1 ; i <= row ; i++){
			
			int ch = 64 + row;
                        for(int j = 1 ; j <= row ; j++){
                                System.out.print((char)ch + "");
                                System.out.print(num + " ");
                                num --;
                        }
			num = row + i;
                        System.out.println();
                }
        }
}
