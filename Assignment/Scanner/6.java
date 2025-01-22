import java.util.*;

class Program6{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                
		System.out.print("Enter starting of range : ");
                int num1 = sc.nextInt();

                System.out.print("Enter ending of range : ");
                int num2 = sc.nextInt();

                for(int i= num1 ; i <= num2 ; i++){
                         System.out.print(i + ",");
                }
        }
}
