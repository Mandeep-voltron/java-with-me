import java.util.Scanner;
public class lavaz3
{
 public static void main(String args[])
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Your experience on LAVA indian phone company.");
  System.out.print("                If good enter '1' if bad enter '0' : ");
  int a = sc.nextInt();
  if(a==1){
  System.out.println("                  ---  THANK YOU ! We will keep making these products for you. ");
  }
  else if(a==0){
   System.out.println("         Sorry ! We will try to make products better for you in future."); 
  }
  else{
  System.out.println("          'YOU HAVE GIVEN WRONG INPUT'");
  }
  System.out.println("                               ---    THANK YOU!");
  
  
  }
 }