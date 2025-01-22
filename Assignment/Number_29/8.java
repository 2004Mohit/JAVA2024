import java.util.*;

class Program8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int temp = num;
        int temp2 = num;
        int temp3 = num;

        int digit = 0;
        int zeroCnt = 0;
        int cnt = 0;

        if (num > 0) {
            while (num > 0) {
                digit = num % 10;
                num /= 10;
                if (digit == 0) {
                    zeroCnt++;
                }
                cnt++;
            }

            while (temp2 > 1) {
                temp2 /= 10;
            }

            if ((zeroCnt != 0) && (temp3 != 0)) {
                System.out.println(temp3 + " is a Duck Number");
            } else {
                System.out.println(temp3 + " is not a Duck Number");
            }

        } else {
            System.out.println("Enter Postive Integer");
        }

    }
}
