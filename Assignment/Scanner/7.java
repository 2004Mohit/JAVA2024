import java.util.*;

class Program7{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number to print reverse table of : ");
                int num = sc.nextInt();

                for(int i = 10 ; i >= 1 ; i--) {
                         System.out.print(num*i + ",");
                }
        }
}
