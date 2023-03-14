import java.util.Scanner;
public class calculator
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println(" 1. For Sum :1 \n 2. For Diffrence :2 \n 3. For product :3 \n 4. For Division :4  ");
      int a = sc.nextInt();
      if(a>0 && a<=4){
         System.out.println("Enter the first numbers:");
         double b = sc.nextDouble();
         System.out.println("Enter the second numbers:");
         double c = sc.nextDouble();
         double d ;
         if(a==1){
            d=b+c;
            System.out.println("The sum is:"+d);
         }
         else if(a==2){
            if(b>c){
               d=b-c;
            }
            else{
               d=c-b;
            }
         
            System.out.println("The diffrence is:"+d);
         }
         else if(a==4){
            if(b>c){
               d=c/b;
            }
            else{
               d=b/c;
            }
         
            System.out.println("The division is:"+d);
         }
         else{
            d=b*c;     
            System.out.println("The quoitent is:"+d);
         }
      
      
      
      } 
   
   }
}