import java.io.*;

class Program6{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                char arr[] = new char[10];

                for(int i = 0 ; i < arr.length ; i++){

                        System.out.print("Enter Character at index  " + i + " : ");
                        char ch = (char)br.read();
			br.skip(1);
                        arr[i] = ch;
                }

                for(int i = 0 ; i < arr.length ; i++){
                        System.out.print(arr[i] + ",");                                                                                                                               }
        }
}
