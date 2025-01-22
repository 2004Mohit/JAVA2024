import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // The string with special characters
        String originalString = "Cell Æ Culture Ø Labor";
        
        // Encode the string to bytes using UTF-8 encoding
        byte[] encodedBytes = originalString.getBytes(StandardCharsets.UTF_8);
        
        // Print the encoded bytes
        for (byte b : encodedBytes) {
            System.out.print(b + " ");
        }
    }
}

