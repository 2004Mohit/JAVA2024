import java.io.*;

class Program4{
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

                System.out.print("Enter Element to be searched: ");
		int ele = Integer.parseInt(br.readLine());
                for(int i = 0 ; i < arr.length ; i++){
                                if(arr[i] == ele){
                                        System.out.println(ele + " found at index " + i);
                                }
                        }
        }
}
