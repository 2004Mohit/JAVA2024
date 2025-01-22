import java.util.Scanner;
class code3 {
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("ENTER NAME : ");
                String name= sc.next();
                System.out.print("ENTER COLLEGE NAME : ");
                String clgname= sc.next();
                System.out.print("ENTER STUDENT ID : ");
                int id= sc.nextInt();
                System.out.print("ENTER CGPA : ");
                float cg = sc.nextFloat();
                System.out.println("NAME : "+name);
                System.out.println("COLLEGR NAME : "+clgname);
                System.out.println("ID :"+id);
                System.out.println("CGPA : " +cg);
        }
}
