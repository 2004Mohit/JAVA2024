import java.io.*;

class Program1{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                int arr[] = new int[SIZE];
		int count = 0;
                System.out.println("Enter Elements :");
                for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }

              	System.out.print("Even numbers are : ");
                        for(int i = 0 ; i < arr.length ; i++){
                                if(arr[i] % 2 == 0){
					System.out.print(arr[i] + "\t");
					count++;
				}
			}  
                System.out.println();
                System.out.println("Count of even elements is :" + count);
        }

}
