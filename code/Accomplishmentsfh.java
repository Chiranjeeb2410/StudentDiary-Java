import java.util.*;
import java.io.*;

public class Accomplishmentsfh  {

  public static ArrayList<Accomplishmentsfh> get(String file) {

    String filename="../files/Accomplishments/"+file;
    ArrayList<Accomplishmentsfh> list=new ArrayList<Accomplishmentsfh>();

    try{
      ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
      while(true){
        list.add((Accomplishmentsfh)in.readObject());
      }
    }

    catch(EOFException e){
      return list;
    }

    catch(IOException e){
      System.out.print("  [*] An Error Occured While Reading the Accomplishments.");
      System.out.println(" Please ensure that you enter Data first!");
      return list;
    }

    catch(ClassNotFoundException e){
      System.out.println("*****Error ! Accomplishments.java file is missing !*****");
      return list;
    }

  }

  public static void put(ArrayList<Accomplishmentsfh> list,String file){

    String filename="../files/Accomplishments/"+file;

    try{
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
      for(Accomplishmentsfh obj:list){
        out.writeObject(obj);
      }
    }

    catch(IOException e){
      System.out.print("  [*] An Error Occured While Reading Accomplishments.");
      System.out.println(" Please ensure that you enter data first!");
    }

  }
}
