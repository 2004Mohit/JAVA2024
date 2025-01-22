import java.util.Scanner;
class code1 {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.print("ENTER NAME : ");
                String name= sc.next();
                System.out.print("ENTER COLLEGE NAME : ");
                String clgname= sc.next();
                System.out.print("ENTER STUDENT ID : ");
                int id= sc.nextInt();
                System.out.print("ENTER CGPA : ");
                float cg = sc.nextFloat();
                System.out.println(name);
                System.out.println(clgname);
                System.out.println(id);
                System.out.println(cg);
        }
}

