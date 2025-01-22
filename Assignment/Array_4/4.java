import java.io.*;

class Program4{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                int arr[] = new int[SIZE];
		int cnt = 0;
		
		System.out.print("Enter Elements : ");
                for(int i = 0 ; i < arr.length ; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("Enter Element to check : ");
                int ele = Integer.parseInt(br.readLine());
                
		for(int i = 0 ; i < arr.length ; i++){
                        if(arr[i] == ele){
				cnt++;		
			}
		}
		if(cnt >= 2){
			System.out.println(ele + " occurs more than 2 times in array");
			}

		}
}

