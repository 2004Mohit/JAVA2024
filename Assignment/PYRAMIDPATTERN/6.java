import java.io.*;

class Program6{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                for(int i =  1; i <= row ; i++){
                        int num = row;
                        for(int space =1; space <= (row-i) ; space++){
                                System.out.print(" " + "\t");
                        }
                        for(int j = 1 ; j <= (2*i)-1 ; j++){
                                if(j < i){
                                        System.out.print(num + "\t");
                                        num--;
                                }
                                else{
                                        System.out.print(num + "\t");
                                        num++;
                                }
                        }
                                System.out.println();
                }
        }
}
