import java.io.*;

class Program3{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                for(int i = 1 ; i <= row ; i++){
                	int num = 1;
			int ch = 64 + row;
                        for(int j = 1 ; j <= row ; j++){
                                if( i % 2 != 0 ){
				System.out.print((char)ch + " ");
				ch--;
				}
				else{
                                System.out.print(num + " ");
                                num ++;
				}
			}
                        System.out.println();
                
        }
	}
}
