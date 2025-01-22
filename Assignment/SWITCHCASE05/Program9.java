import java.util.*;

class Program9{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                
		System.out.print("Enter Marks of Maths : ");
                int marks1 = sc.nextInt();

		System.out.print("Enter Marks of Physics : ");
                int marks2 = sc.nextInt();

                System.out.print("Enter Marks of Chemistry : ");
                int marks3 = sc.nextInt();

                System.out.print("Enter Marks of Physics : ");
                int marks4 = sc.nextInt();

                System.out.print("Enter Marks of History : ");
                int marks5 = sc.nextInt();

		if(marks1 >= 35 &&  marks2 >= 35 && marks3 >= 35 &&  marks4 >= 35 && marks5 >= 35){
		int sum = (marks1 + marks2 + marks3 + marks4 + marks5);{

		switch(sum / 5){
			case 90:
                                System.out.println("Excellent");
                                break;
                        case 'O':
                                System.out.println("Outstanding");
                                break;
                        case 'B':
                                System.out.println("Very Good");
                                break;
                        case 'C':
                                System.out.println("Good");
                                break;
                        case 'F':
                                System.out.println("Fail");
                                break;
                        default:
                                System.out.println("Invalid Input");
                                break;
			}
		}
		else{
			System.out.println("You Failed Exam");
			}
		
	}
}
                
