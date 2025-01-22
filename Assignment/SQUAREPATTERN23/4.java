import java.io.*;

class Program4{
	public static void main(String[] args)throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Rows : ");
		int row = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= row ; i++){
			for(int j = 1 ; j <= row ; j++){
				if( (i % 2 == 0) && ( j % 2 == 0)){
					System.out.print("$\t");	
				}
				else{
					System.out.print("&\t");	
				}
			}
			System.out.println();
		}
	}
}

