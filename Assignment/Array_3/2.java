import java.io.*;

class Program2{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                int arr[] = new int[SIZE];
                int cnt = 0;
		int position = 0;

                System.out.println("Enter Elements :");
                
		for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }

		System.out.println("Specific Number :");
		int ele = Integer.parseInt(br.readLine());

		for(int i = 0 ; i < arr.length ; i++){
                        if(arr[i] == ele){ 
				cnt++;
				position = i;
				break;
			}
                }
	      	
		if(cnt != 0){
			System.out.println("num " + ele + " first occured " + cnt + " at index " + position );
		}
		else{
			System.out.println("num " + ele + " not found in array ");
		}
        }

}
