import java.io.*;

class Program8{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter count of Emplyoees: ");
                int COUNT = Integer.parseInt(br.readLine());
                int arr[] = new int[COUNT];

                for(int i = 0 ; i < arr.length ; i++){

                        System.out.print("Enter Age of Emplyoee Number " + (i+1) + " : ");
                        int ele = Integer.parseInt(br.readLine());

                        arr[i] = ele;
                }

                for(int i = 0 ; i < arr.length ; i++){
                        System.out.println("Age of Emplyoee Number " + (i+1) + " : " + arr[i]);
                                         
                }
        }
}
