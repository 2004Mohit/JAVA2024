import java.util.*;

class Program1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0){
			 System.out.println(num + " is Even");
		}
		else{
                         System.out.println(num + " is Odd");
                }
	}
}
