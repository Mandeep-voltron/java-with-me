public class CWH_do_loop
{
   public static void main(String args[])
   {
   int a = 0;
   do{
   System.out.println(a);   //do while is once executed although it is false , while doesn't
   a++;
   }while(a<5);
   
   System.out.println("Quick quiz ");  
   int b = 1;
   int n = 50;
   do{
   System.out.println(b);
   b++;
   }while(b<=n);
   
   }
}