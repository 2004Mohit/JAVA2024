import java.io.*;

class Code32{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name: ");
		String name = br.readLine();

		System.out.println("Enter Your Society Name: ");
		String socName = br.readLine();
		
		System.out.println("Enter Your Flatno: ");
		int flatNo = Integer.parseInt(br.readLine());

		System.out.println("Enter Wing: ");
                char wing = (char)br.read();
	}
}
