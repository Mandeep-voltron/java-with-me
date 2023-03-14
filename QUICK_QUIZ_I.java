import java.util.*;
public class QUICK_QUIZ_I 
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Program to find the percentage  of the student's marks in the exam .");
 System.out.println("Marks in Computer :");
 double a = sc.nextInt();
 System.out.println("Marks in Math:");
 double b = sc.nextInt();
 System.out.println("Marks in Science :");
 double c = sc.nextInt();
 System.out.println("Marks in S.S.T : ");
 double d = sc.nextInt();
 System.out.println("Marks in English : ");
 double e = sc.nextInt();
 double Percentage = (a+b+c+d+e)/(100*5)*100;
 System.out.println("The percentage is : " + Percentage); 
 }
}