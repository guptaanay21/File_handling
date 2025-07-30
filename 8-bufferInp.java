import java.io.*;

public class bufferInp {

        public static void main(String[] args) {
            try {
                // Source file (input) and destination file (output)
                FileInputStream fis = new FileInputStream("input.jpg");
                BufferedInputStream bis = new BufferedInputStream(fis);

                FileOutputStream fos = new FileOutputStream("output.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(fos);

                int byteData;
                while ((byteData = bis.read()) != -1) {
                    bos.write(byteData);
                }

                // Always close in reverse order of opening
                bis.close();
                bos.close();

                System.out.println("File copied successfully using BufferedInputStream and BufferedOutputStream.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }