import java.util.*;

class Program8{
        public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num1 : "); 
		int num1 = sc.nextInt();

		System.out.print("Enter Num2 : ");
                int num2 = sc.nextInt();
		
		int product;
		if(num1 > 0 && num2 > 0){
		product = num1 * num2;
		

		switch(product % 2){
			case 0:
				System.out.println(product + " is Even ");
				break;
			case 1:
                                System.out.println(product + " is Odd ");
				break;
			default:
                                System.out.println("Invalid Input ");
				break;
		
			}
		}
		else{
			System.out.println("Sorry negative numbers are not allowed ");
		}
	}
}
