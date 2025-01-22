import java.io.*;

class Program8{
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
		for(int i = 0 ; i < arr.length ; i++){
                	if(arr[i]>5 && arr[i]<9){
                		System.out.println(arr[i] + " is greater than 5 but less than 9 " );
			}
		}
	}
}
                                        
