import java.io.*;

class Program1{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int arr[] = new int[10];

                for(int i = 0 ; i < arr.length ; i++){

                        System.out.print("Enter Element at index  " + i + " : ");
                        int ele = Integer.parseInt(br.readLine());

                        arr[i] = ele;
                }

                for(int i = 0 ; i < arr.length ; i++){
                        System.out.print(arr[i] + ",");                                                                                                                               }
        }
}
