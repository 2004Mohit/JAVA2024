import java.io.*;

class Program10{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                int arr[] = new int[SIZE];

                System.out.println("Enter Elements :");
                for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }

                int max = arr[0];
		int position = 0;
                        for(int i = 0 ; i < arr.length ; i++){
                                if(max < arr[i]){
                                        max = arr[i];
					position = i;
                                }
                        }
                System.out.println("Maximum Number in array is fount at "+ position + " is "+ max);
        }

}
