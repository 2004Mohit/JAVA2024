import java.io.*;

class Program10{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
             	int ch = 64 + row;
                for(int i =  1; i <= row ; i++){
             	       for(int space =1; space <= (row-i) ; space++){
                                System.out.print(" " + "\t");
                        }
                        for(int j = 1 ; j <= (2*i)-1 ; j++){
				if(j < i){
					System.out.print((char)ch + "\t");
					ch++;
                        }
				else{
					System.out.print((char)ch + "\t");
					ch--;
			
				}
			}
                       
                        
                        System.out.println();
                }
        }
}
