import java.io.*;

class Code36{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name: ");
		String name = br.readLine();

		System.out.println("Enter Your Society Name: ");
		String socName = br.readLine();

		System.out.println("Enter Wing: ");
            	char wing = (char)br.read();
		br.skip(1);

		System.out.println("Enter Your Flatno: ");
                String flatNo = br.readLine();
		
		System.out.println("Name : " + name);
		System.out.println("Society Name : " + socName);
		System.out.println("Wing : " + wing);
		System.out.println("flatNo : " + flatNo);
	}
}
