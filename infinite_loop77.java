 public class infinite_loop77
{
 public static void main(String args[])
 {
 int a = 85;
 int b = 95;
 int c = a*b+a/b-a-b/b*a*b-a;
 while (true){
 System.out.println(c);
  }
 }
} 