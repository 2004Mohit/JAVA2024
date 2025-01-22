import java.io.*;

class Program3{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
		int SIZE = Integer.parseInt(br.readLine());
		char arr[] = new char[SIZE];
		System.out.println("Enter Elements :");

                for(int i = 0 ; i < arr.length ; i++){
			arr[i] = (char)br.read();
			br.skip(1);
                }

                for(int i = 0 ; i < arr.length ; i++){
			if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' ||arr[i]=='O' || arr[i]=='U' ||arr[i]=='a' ||arr[i]=='e' ||arr[i]=='i' ||arr[i]=='o' ||arr[i]=='u'){
                        System.out.println("Vowel "+ arr[i] + " found at index "+ i);                                                                                                                               }
        }
}
}
