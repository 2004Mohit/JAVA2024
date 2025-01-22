import java.util.*;

class Program8{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter starting of range :");
                int num1 = sc.nextInt();
                
		System.out.print("Enter ending of range : ");
                int num2 = sc.nextInt();

		int sum = 0;

                for(int i= num1 ; i <= num2 ; i++){
                         sum += i;
                }

		System.out.println("Sum of numbers in range "+ num1 + " to " + num2 + " is: "+ sum);
        }
}
