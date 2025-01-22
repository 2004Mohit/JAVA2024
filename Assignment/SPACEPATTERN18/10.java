import java.io.*;

class Program10{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                int ch = 65;
		for(int i =  row; i >= 1 ; i--){
                        for(int space =1; space <= (row-i) ; space++){
                                System.out.print(" " + "\t");
                        }
                        for(int j = 1 ; j <= i ; j++){
                                if((i+j) % 2 == 0){
					System.out.print((char)ch + "\t");
				}	
				else{
					System.out.print(ch + "\t");
				}
				ch++;
                        }
			ch = ch-i+1;
                        System.out.println();
                }
        }
}
