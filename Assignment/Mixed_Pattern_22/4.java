import java.io.*;

class Program2{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                for(int i = 1 ; i <= row ; i++){
                        int ch = 64 + i;
			for(int sp = 1 ; sp <= (i-1) ; sp++){
                                System.out.print(" " + "\t");
                        }
                        for(int j = 1 ; j <= (row-i+1) ; j++){
                                if(row % 2 == 0){
					System.out.print((char)(ch + 32) + "\t");
				}
				else{
					System.out.print((char)(ch) + "\t");
				}
				ch++;
			}
                        System.out.println();
                }
        }
}
