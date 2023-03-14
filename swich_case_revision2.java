import java.util.Scanner;
public class swich_case_revision2
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your age:");
 int a = sc.nextInt();
 switch(a){
 case 18:
 System.out.println("you are going to be an adult."); 
 break;
 case 24:
 System.out.println("you are going to get a job."); 
 break;
 case 60:
 System.out.println("you are going to get retired."); 
 break;
 default:
 System.out.println("Enjoy Your Life!");
 }

 System.out.println("Thank you for using my code.");
 }
} 