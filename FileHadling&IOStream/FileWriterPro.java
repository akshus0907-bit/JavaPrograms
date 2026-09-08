import java.io.*;
import java.util.*;

public class FileWriterPro {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("abc.txt");

            fw.write("Name: Rahul\n");
            fw.write("Marks: 85\n");

            fw.close();

            System.out.println("Successfully wrote data");
        }
        catch (IOException e) {
            System.out.println("Error while writing file");
        }
    }
}
		
		