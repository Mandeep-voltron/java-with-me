import java.util.Scanner;
public class vote
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 // code for eligible for voting
 System.out.print("Enter your age: ");
 int age = sc.nextInt();
 if(age>=18){
 System.out.println("You can vote.");
 }
 else{
 System.out.println("You can't vote.");
 }

 }
} 