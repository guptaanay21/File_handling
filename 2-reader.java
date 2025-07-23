import java.io.File;
import java.util.Scanner;

public class reader {
    public static void main(String[] args){
        File myFile=new File("istFile.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(myFile.getName());
        System.out.println("File name: " + myFile.getName());
        System.out.println("Absolute path: " + myFile.getAbsolutePath());
        System.out.println("Is writable: " + myFile.canWrite());
        System.out.println("Is readable: " + myFile.canRead());
        System.out.println("Is file: " + myFile.isFile());
        System.out.println("Is directory: " + myFile.isDirectory());
        System.out.println("File size (bytes): " + myFile.length());
        System.out.println("File exists: " + myFile.exists());
    }
}
