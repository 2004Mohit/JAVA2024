import java.io.*;

class Program2{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                int arr[] = new int[SIZE];
                int sum = 0;
                System.out.println("Enter Elements :");
                for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }

                System.out.print("Elements divisible by 3 are : ");
                        for(int i = 0 ; i < arr.length ; i++){
                                if(arr[i] % 3 == 0){
                                        System.out.print(arr[i] + "\t");
                                        sum+= arr[i];
                                }
                        }
                System.out.println();
                System.out.println("Sum of Elements divisible by 3 is:" + sum);
        }

}
