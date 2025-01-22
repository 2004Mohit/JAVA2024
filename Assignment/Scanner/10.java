import java.util.*;

class Program10{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter marks in Maths : ");
                int marks1 = sc.nextInt();

                System.out.print("Enter marks in English : ");
                int marks2 = sc.nextInt();

                System.out.print("Enter marks in Science : ");
                int marks3 = sc.nextInt();

                System.out.print("Enter marks in Marathi : ");
                int marks4 = sc.nextInt();

                int sum = marks1 + marks2 + marks3 + marks4 ;

                System.out.println(sum + " Out of 400");
        }
}
