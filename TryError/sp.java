import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;

public class sp
{
	public static void main(String args[])
	{
			   String thisString = ("Cell Æ Culture Ø Labor");
			   Charset charset = StandardCharsets.UTF_8;
			   byte[] byteArrray = thisString.getBytes(charset);
			   System.out.println(thisString);
			   
			   String byteString = new String(byteArrray);
			   System.out.println(byteString);
	}
}  
