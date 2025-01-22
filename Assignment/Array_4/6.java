import java.io.*;

class Program6{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                char arr[] = new char[SIZE];
		int vCnt = 0;
		int cCnt = 0;
		
		System.out.println("Enter Elements : ");	
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = (char)br.readLine().charAt(0);
		}

                for(int i = 0 ; i < arr.length ; i++){
                        if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o'|| arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' ||arr[i] == 'O' || arr[i] == 'U'){
				vCnt++;
			}
			else{
				cCnt++;
			}
		}
			System.out.println("Count of Vowels : " + vCnt);
			System.out.println("Count of Consonents : " + cCnt);
			}
			
}

