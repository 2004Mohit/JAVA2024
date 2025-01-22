import java.io.*;
class Program10{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());

                for(int i = 1 ; i <= row ; i++){
                        int num = i ;
                        for(int sp = 1 ; sp <= (row-i) ; sp++){
                                System.out.print(" " + "\t");
                        }

			for(int j = i ; j >= 1 ; j--){
				System.out.print(j + "\t");
			}
			for(int j = 2 ; j <= i ; j++){
				System.out.print(j + "\t");
			}

			System.out.println();
		}
	}
}
