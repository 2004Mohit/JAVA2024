import java.io.*;

class Program5{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                int num = 3;
                for(int i = 1 ; i <= row ; i++){
                        for(int j = 1 ; j <= row ; j++){
                                if(i % 2 == 0){
					System.out.print(num + "\t");
				}
				else{
					System.out.print((num * num) + "\t");
				}
                                num++;
                        }
                        System.out.println();
                }
        }
}
