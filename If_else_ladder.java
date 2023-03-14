import java.util.Scanner;
public class If_else_ladder {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER YOUR AGE!");
      int age = sc.nextInt();    
      if(age == 18)
         System.out.println("YOU are going to be an adult!");
      else if(age == 24)
         System.out.println("You are going to get a job.");
      else if(age == 60)
         System.out.println("You are going to retired.");
      else 
         System.out.println("ENJOY YOUR LIFE!");
   }
}