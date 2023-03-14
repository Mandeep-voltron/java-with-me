import java.util.Scanner;
public class SWITCH_CASE_revison
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("What is your age:");
 int age = sc.nextInt();
 switch(age){
 case 18:
 System.out.println("YOU CAN DRIVE A VECHILE");
 break;
 case 24:
  System.out.println("YOU are going to get a job");
  break;
  case 60:
   System.out.println("YOU ARE GOING TO GET RETIRED");
  break;
  default:
   System.out.println("enjoy your life");
  }
 System.out.println("thankyou for using my code");
 }
} 