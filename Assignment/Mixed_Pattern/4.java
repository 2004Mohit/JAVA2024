import java.io.*;

class Program4{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                //int num = i;
		for(int i = row ; i >= 1 ; i--){
                int num = i;
                        for(int j = i ; j <= row ; j++){
                                System.out.print(num + " ");
				num += i; 
                        }
                        System.out.println();

        }
	}
}

