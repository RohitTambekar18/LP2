import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Example {
    public static void main(String[] args) {
        String input = "Hello, World!";

        try {
            // Create a MessageDigest object with MD5 algorithm
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Convert the input string to bytes
            byte[] inputBytes = input.getBytes();

            // Calculate the MD5 hash
            byte[] hashBytes = md.digest(inputBytes);

            // Convert the hash bytes to a hexadecimal representation
            StringBuilder hexBuilder = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = String.format("%02x", b);
                hexBuilder.append(hex);
            }

            // Print the MD5 hash
            System.out.println("MD5 Hash: " + hexBuilder.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
