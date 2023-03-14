import java.util.Scanner;
public class school_work_to_SI
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the principle = ");
 int p = sc.nextInt();
 System.out.println("Enter the rate in percentage(%) for a year = ");
 float r = sc.nextFloat();
 System.out.println("Enter the time in years = ");
 float t = sc.nextFloat();
 float si = p*r*t/100;
 System.out.println(" SI = "+si);
 }
} 