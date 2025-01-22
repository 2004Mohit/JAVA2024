import java.io.*;

class Program9{
        public static void main(String[] args)throws IOException{
                BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                int num = row * row;
		for(int i = 1 ; i <= row ; i++){
                        for(int j = 1 ; j <= row ; j++){
                                if( ( j % 2 == 0 ) ){
					System.out.print("@\t");
				}
				else{
					System.out.print((num * i) + "\t");
				}	
                       	num--;
		       	}
                        System.out.println();
                }
        }
}
