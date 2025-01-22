import java.util.*;

class Program4{
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter number : ");
                int num = sc.nextInt();
                int temp = num;
                int sum = 0;
                if (num > 0) {
                        while (num > 0) {
                                if ((temp % num == 0) && (temp != num)) {
                                        sum += num;
                                }
                                num--;
                        }

                        if (sum > temp) {
                                System.out.println(temp + " is a Abundant Number");
                        } else {

                                System.out.println(temp + " is not a Abundant Number");
                        }
                } else {
                        System.out.println("Enter Postive Integer");
                }

        }

}

