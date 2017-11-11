import java.util.*;

public class AddCourse extends CourseManip{
  Course newCourse;

  AddCourse(){
    newCourse = new Course();
    newCourse.setDetails();
    courseList = new  ArrayList<Course>();
  }

  AddCourse(Course c){
    newCourse=c;
  }

  public void Add(){
    if(check("Courses")==true){
      courseList = Course.get();
      for(Course obj:courseList){
        if(newCourse.equals(obj)){
          System.out.println("Course Exists !");
          return;
        }
      }
    }
    courseList.add(newCourse);
    Course.put(courseList);
  }
}
