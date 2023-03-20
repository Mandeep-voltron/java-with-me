import java.util.Scanner;
public class grades
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your marks in following subjects(from 100):");
System.out.println("Maths:");
int a = sc.nextInt();
System.out.println("Physics:");
int b = sc.nextInt();
System.out.println("Chemistry:");
int c = sc.nextInt();
System.out.println("Computer:");
int d = sc.nextInt();
double sum = 0;
sum = a+b+c+d;
double per = sum/400*100;
System.out.println("percentage:"+per);
if(a>=33 && b>=33 && c>=33 && d>=33 ){
 if(per>=45){
System.out.println("Congratulations,you are promoted to next class.");                         
}
else{
System.out.println("your percentage is less than 45:"+per);
}
}
else{
System.out.println("Sorry,you are not promoted to next class.As you hava scored less then 33 in a subject");
}

if(a<33){
System.out.println("MATHS:"+a);
}
else if(b<33){
System.out.println("PHYSICS:"+b);
}
else if(c<33){
System.out.println("CHEMISTRY:"+c);
}
else if(d<33){
System.out.println("COMPUTER:"+d);
}



}
}