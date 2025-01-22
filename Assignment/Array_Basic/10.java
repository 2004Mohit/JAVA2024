import java.io.*;

class Program10{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter number of subjects whose marks are to be stored: ");
                float COUNT = Float.parseFloat(br.readLine());
                float arr[] = new float[COUNT];
                float sum = 0;
                for(int i = 0 ; i < arr.length ; i++){

                        System.out.print("Enter Marks of Subject " + (i+1) + " : ");
                        float marks = Float.parseFloat(br.readLine());

                        arr[i] = marks;
                }

                for(int i = 0 ; i < arr.length ; i++){
                                sum+= arr[i];
                }
		float avg = sum/(COUNT);
                        System.out.println("You Scored "+ avg + "%");
        }

}
