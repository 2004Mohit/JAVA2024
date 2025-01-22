import java.io.*;
class code22 {
	public static void main(String[] s) throws IOException { 
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String name = br.readLine();
		System.out.println("Name : "+name);
		String compName = br.readLine();
		System.out.println("Company Name : "+compName);
	}
}


