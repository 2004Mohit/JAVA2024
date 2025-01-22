import java.util.*;

class Program5{
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int temp = num;
        int sq = num * num;
        int cnt = 0;
        int rev = 0;
        int rev2 = 0;

        while (num > 0) {
            num /= 10;
            cnt++;
        }

        while (cnt > 0) {
            int rem = sq % 10;
            rev = rev * 10 + rem;
            sq /= 10;
            cnt--;
        }

        while (rev > 0) {
            int rem = rev % 10;
            rev2 = rev2 * 10 + rem;
            rev /= 10;
        }

        if (rev2 == temp) {
            System.out.println("Number is Automorphic");
        } else {
            System.out.println("Number is not Automorphic");
        }
    }

}
