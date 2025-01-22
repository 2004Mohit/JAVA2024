import java.util.*;

class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int temp = num;
        int temp2 = num;
        int digit = 0;
        int sum = 0;
        int cnt = 0;

        if (num > 0) {
            while (num > 0) {
                digit = num % 10;
                cnt++;
                num /= 10;
            }

            while (temp > 0) {
                int armstrong = 1;
                digit = temp % 10;
                for (int i = 1; i <= cnt; i++) {
                    armstrong *= digit;
                }
                sum += armstrong;
                temp /= 10;
            }

            if (temp2 == sum) {
                System.out.println(temp2 + " is a Armstrong Number");
            } else {
                System.out.println(temp2 + " is not a Armstrong Number");
            }
        }

        else {
            System.out.println("Enter Postive Integer");
        }
    }
}

