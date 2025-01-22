import java.io.*;

class Program8{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                char arr[] = new char[SIZE];
		int cnt = 0;

		System.out.println("Enter Elements :");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = br.readLine().charAt(0);
		}

		System.out.print("Enter the Character of the array : ");
		char ele = br.readLine().charAt(0);

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] == ele){
				cnt++;
			}
		}

		System.out.println(ele+ " has occured " + cnt + " times in the given array");
		

			
		}
}
