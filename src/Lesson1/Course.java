package Lesson1;

public class Course {
     public int powerConsumption;

     public Course (int powerConsumption) {

     }
     public boolean passage (int power) {
         powerConsumption -= power;
         if (power > powerConsumption) {
             return true;
         }
         else {
             return false;
         }
     }

}
