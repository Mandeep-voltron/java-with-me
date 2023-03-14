import java.util.*;
public class cwh_first
{
 public static void main(String args[])
 {
 //the program to find the loss percentage by taking user input.
 Scanner sc = new Scanner(System.in);
 System.out.println("The Cost price of the article is:");
 double cp = sc.nextInt();
 System.out.println("The Selling price of the article is:");
 double sp = sc.nextInt();
 double loss = (cp - sp);
 System.out.println("The Loss is :" + loss);
 double loss_percentage = (loss*100)/cp;
 System.out.println("The Loss percentage is :" + loss_percentage );
 }
} 