        import java.io.*;

        public class fileinpStream {
        public static void main(String[] args) {
            try {
                // Reading from input file
                FileInputStream fis = new FileInputStream("input.txt");

                // Writing to output file
                FileOutputStream fos = new FileOutputStream("output.txt");

                int byteData;
                while ((byteData = fis.read()) != -1) {
                    fos.write(byteData);
                }

                // Closing the streams
                fis.close();
                fos.close();

                System.out.println("File copied successfully using FileInputStream and FileOutputStream.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
