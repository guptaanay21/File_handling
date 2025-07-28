import java.io.*;

public class fReader {
    public static void main(String[] args) {
        try {
            // Step 1: First write data to bufferFile.txt using FileWriter
            FileWriter writer = new FileWriter("bufferFile.txt");
            writer.write("Hello from Writer class!\n");
            writer.write('X');
            writer.write(65);
            writer.close();

            // Step 2: Now read from bufferFile.txt and copy to outputbufferFile.txt
            FileReader fr = new FileReader("bufferFile.txt");
            FileWriter fw = new FileWriter("outputbufferFile.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied using FileReader + FileWriter.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
