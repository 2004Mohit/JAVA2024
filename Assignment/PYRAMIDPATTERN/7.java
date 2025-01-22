import java.io.*;

class Program7{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                int num = 1;
                char ch = 'A';
		for(int i =  1; i <= row ; i++){
                        for(int space =1; space <= (row-i) ; space++){
                                System.out.print(" " + "\t");
                        }
                        for(int j = 1 ; j <= (2*i)-1 ; j++){
                                if(i % 2 == 0){
                                        System.out.print(ch + "\t");
                                }
                                else{
                                        System.out.print(num + "\t");
                                }
                        }
			ch++;
			num++;
                        System.out.println();
                }
        }
}
