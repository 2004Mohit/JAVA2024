import java.io.*;

class Program10{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                char arr[] = new char[SIZE];
		
		System.out.println("Enter Elements : ");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = br.readLine().charAt(0);
		}

		System.out.print("Enter the Character key: ");
                char ele = br.readLine().charAt(0);

                for(int i = 0 ; i < arr.length ; i++){
                        if(arr[i] == ele){
				break;
			}
			System.out.println(arr[i] + "\t");
			}

		}
			
}

