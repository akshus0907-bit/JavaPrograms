import java .io.*;
import java.util.*;

public class FileCreated{

  public static void main(String[]args)throws Exception{
  Scanner in=new Scanner(System.in);
  
  File file=new File("abc.txt");
  
  if(file.createNewFile()){
	  System.out.println("file creted sucessfully");
  }
  else{
	  System.out.println("file not cretaed");
  }
  
   System.out.println("File name: " + file.getName());
        System.out.println("Exists: " + file.exists());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Is File: " + file.isFile());
  }
}