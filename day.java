import java.util.Scanner;
public class day
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number of days:");
 int days = sc.nextInt();
 int ysr = days/365;
 int ldays = days%365;
 int months = ldays/30;
 int day = ldays%30;
  System.out.println(" Years: "+ysr);
  System.out.println(" Months: "+months);
  System.out.println(" Days "+day);
 


 
 }
} 