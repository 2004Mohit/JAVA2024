import java.io.*;

class Program6{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                int arr[] = new int[SIZE];
                int product = 1;
                System.out.println("Enter Elements :");
                for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }

                for(int i = 0 ; i < arr.length ; i++){
                                if(i % 2 != 0){
                                        product*= arr[i];
                                }
                        }
                System.out.println("Product of odd indexed elements : " + product);
        }
}
