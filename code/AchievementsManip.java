import java.util.*;
import java.io.*;

public class AchievementsManip extends Accomplishmentsfh    {

  StudentDetails studDet;
  Accomplishmentsfh achieve;

  ArrayList<Accomplishmentsfh> achieveList;

  AchievementsManip(String roll){
    studDet = new StudentDetails(roll);
    achieve = new Accomplishmentsfh();
  }

  public boolean getAchievements(){
    if(Functions.check("Achievements/"+studDet.getRollno())){
      achieveList = Accomplishmentsfh.get(studDet.getRollno());
      return true;
    }
    else{
      achieveList = new ArrayList<Accomplishmentsfh>();
      return false;
    }
  }

}
