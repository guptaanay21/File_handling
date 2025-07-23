import java.io.File;

public class delete {
    public static void main(String[] args){
        File myFile=new File("istFile.txt");
        if(myFile.delete()){
            System.out.println("i have deleted file: "+ myFile.getName());
        }else{
            System.out.println("some problem occured for deletion");

        }

        }
}
