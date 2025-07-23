import java.io.FileWriter;
import java.io.IOException;

public class writer {
    public static void main(String[] args){
        try{
            FileWriter fileWriter=new FileWriter("istFile.txt");
            fileWriter.write("This is our first file\n okay now bye");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
