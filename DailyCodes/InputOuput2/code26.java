import java.io.*;
class code26 {
	public static void main(String[] s) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter Company Name : ");
		String compName = br.readLine();
		System.out.print("Enter Employee Name : ");
		String empName = br.readLine();
		System.out.print("Enter Employee ID : ");
                int empid = Integer.parseInt(br.readLine());
		System.out.print("Enter Employee Salary : ");
                double sal = Double.parseDouble(br.readLine());
		System.out.println("Company Name : "+compName);
                System.out.println("Employee Name : "+empName);
		System.out.println("Employee ID : "+empid);
		System.out.println("Employee Salary : "+sal);
	}
}


