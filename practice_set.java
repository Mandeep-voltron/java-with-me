import java.util.*;
public class practice_set
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner (System.in);
 System.out.println("Your marks in Math is:");
 byte a  = sc.nextByte();
 System.out.println("Your marks in Physics is:");
 byte b  = sc.nextByte();
 System.out.println("Your marks in Chemistry is:");
 byte c = sc.nextByte();
 float avg = (a+b+c)/3.0f;
 System.out.println("Overall percentage:" + avg);
 if(avg>=40 && a>=33 && b>=33 && c>=33){
 System.out.println("Congratulation, You are promoted");
 }
 else{
 System.out.println("Sorry, You are not promoted.");
 }
 }
} 