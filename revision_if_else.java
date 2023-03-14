import java.util.Scanner;
public class revision_if_else
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
         // if-else statement
 /*
 System.out.print("Enter your current age: ");
 int age = sc.nextInt();
 if(age >= 18 && age<=20){
 System.out.println("You joined your college.");
 }
 else if(age>=24 && age <=30){
 System.out.println("Congratulations, you got the job.");
 }
 else if(age == 60){
 System.out.println("You are retired.");
 }
 else{
 System.out.println("Enjoy ,your life.");
 }
 System.out.println("Thank you!");
 
 */
 
   //Switch-case statement
   System.out.println("Enter your age: ");
   int a = sc.nextInt();
   
   switch(a){
   case 18:
   System.out.println("you are going to be an adult.");
   break;
   default:
   System.out.println("Enjoy your life");
   
   }
   
   
 }
}                                                