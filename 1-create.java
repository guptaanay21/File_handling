import java.io.File;
import java.io.IOException;

public class istFile {
    public static void main(String[] args){

        //code to create a new file
        File myFile=new File("IstFile.txt");
            try {
                myFile.createNewFile();
            } catch (IOException e) {
                System.out.println("unabled to create this file");
                e.printStackTrace();
            }
        }
    }