import java.util.*;

class Program9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int temp = num;
        int digit = 0;
        int sum = 0;

        if (num > 0) {
            while (num > 0) {
                digit = num % 10;
                num /= 10;
                sum += digit;
            }

            if (temp % sum == 0) {
                System.out.println(temp + " is a Harshad Number");
            } 
	    else {
                System.out.println(temp + " is not a Harshad Number");
            }

        } 
	else {
            System.out.println("Enter Postive Integer");
        }

    }
}
