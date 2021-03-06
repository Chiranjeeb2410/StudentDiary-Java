import java.io.*;
import java.util.*;

public class StudentCoursefh    {

  public static ArrayList<StudentCourse> get(String file)   {

    String filename="../files/"+file;
    ArrayList<StudentCourse> list = new ArrayList<StudentCourse>();

    try{
      ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
      while(true){
        list.add((StudentCourse)in.readObject());
      }
    }

    catch(EOFException e){
      return list;
    }

    catch(IOException e){
      System.out.print(" An error while reading the students.");
      System.out.println(" Ensure that you enter names first!");
      return list;
    }

    catch(ClassNotFoundException e){
      System.out.println("Course.java file is missing");
      return list;
    }
  }

  public static void put(ArrayList<StudentCourse> list,String file){

    String filename="../files/"+file;

    try{
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
      for(StudentCourse obj:list){
        out.writeObject(obj);
      }
    }

    catch(IOException e){
      System.out.print("An error occured while the reading file.");
      System.out.println(" Please ensure that you enter Names first!");
    }
  }
}
