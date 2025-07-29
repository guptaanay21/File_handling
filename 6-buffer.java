import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class buffer {
    public static void main(String[] args) {
        try {
            // ========== Writing to a file using BufferedWriter ==========
            BufferedWriter writer = new BufferedWriter(new FileWriter("bufferFile.txt"));
            writer.write("Hello! This is written using BufferedWriter.");
            writer.newLine();
            writer.write("Java file handling with buffer is efficient!");
            writer.close();

            // ========== Reading from the file using BufferedReader ==========
            BufferedReader reader = new BufferedReader(new FileReader("bufferFile.txt"));
            String line;

            System.out.println("Reading file contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
