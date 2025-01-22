import java.io.*;
class Demo {

	public static void main(String[] s) {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x;
		int y;

		try {
		
			System.out.println("Start Main");
			x = Integer.parseInt(br.readLine());
			y = Integer.parseInt(br.readLine());
			Thread.sleep(3000);
			System.out.println(x/y);
			System.out.println("End Main");
		}catch(ArithmeticException e) {
		
			System.out.println("ArithmeticException Generated");
		}catch(IOException ioe) {	
			
			System.out.println("IOException Generated");
		}catch(InterruptedException ie) {	
			
			System.out.println("InterruptedException Generated");
		}
	}
}
