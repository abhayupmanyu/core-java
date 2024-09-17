import java.util.*;
import java.io.*;

class leap_year extends Exception {
    public String toString() {
        return "this is not a leap year";
    }
}

public class leap_year_exception2 {

    public static boolean is_Leap_Year(int year) throws leap_year {
        if (year < 0) {
            throw new leap_year();
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int year;
    try{
        System.out.println("enter the year");
        year=sc.nextInt();
       if(is_Leap_Year(year)){
        System.out.println(year+"is a leap year");
       }
       else{
        System.out.println(year+"is not a leap year");
       }
  }
  catch(leap_year e) {
    e.printStackTrace();
    System.out.println("error"+e.getMessage());

  }
}
}