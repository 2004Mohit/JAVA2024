import java.io.*;

class Program7{
        public static void main(String[] args)throws IOException{
                BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                int num = row  ;
		for(int i = 1 ; i <= row ; i++){
                        for(int j = 1 ; j <= row ; j++){
				 if((i % 2 == 0 ) || (j % 2 == 0)){
					System.out.print((num * num) + "\t");
				}
				else{
					System.out.print((num * num - 1) + "\t");
				}	
                       	num++;
		       	}
                        System.out.println();
                }
        }
}
