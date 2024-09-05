import java.util.Scanner;

public class LeapYear {
    
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputYear;
      boolean isLeapYear;
      
      isLeapYear = false;
      inputYear = scnr.nextInt();
      
      
      int centuryYear = inputYear / 400;
      
      if(centuryYear == 0){
         isLeapYear = true;   
      }
      
      System.out.println(inputYear);
   }
}
