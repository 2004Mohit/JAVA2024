import java.io.*;

class Program9{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                char arr[] = new char[SIZE];

		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = br.readLine().charAt(0);
		}

		for(int i = 0 ; i < arr.length ; i++){
			int temp = arr[i];
			if(temp < 97 || temp > 122){
				arr[i] = '#' ;
			}
		}

		for(int i = 0 ; i < arr.length ; i++){
				System.out.println(arr[i] + "\t");
		}

			
		}
	}
