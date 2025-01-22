import java.io.*;

class Program1{
	public static void main(String[] args)throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Rows : ");
		int row = Integer.parseInt(br.readLine());
		int ch = 64 + row;

		for(int i = 1 ; i <= row ; i++){
			for(int j = 1 ; j <= row ; j++){
				if( j != 1){
					System.out.print((char)(ch + 32) + "\t");	
				}
				else{
					System.out.print((char)(ch ) + "\t");	
				}
				ch++;
			}
			System.out.println();
		}
	}
}

