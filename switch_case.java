import java.util.Scanner;
public class switch_case
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your age:");
 int age = sc.nextInt();
 switch (age){
 case 18:
 System.out.println("you are going to be an adult.");
 break;
 case 25:
 System.out.println("you are going to get a job.");
 break;
 case 60:
 System.out.println("You are going to be retired.");
 break;
 default:
 System.out.println("Enjoy your life");
 }
 System.out.println("Thank you for using my code ");
 }
} 