import java.io.*;

class Program3{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
                System.out.print("Enter A Number : ");
                int num = Integer.parseInt(br.readLine());
                int count = 0;
                int temp = num;
                while(num > 0){
                        if(temp % num == 0){
                                count++;
                        }
                        num--;
                }

                if(count == 2){
                        System.out.println(temp + " not a composite number");
                }
                else{
                        System.out.println(temp + " is a composite number");
                }
        }
}
