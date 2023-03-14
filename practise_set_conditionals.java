import java.util.Scanner;
public class practise_set_conditionals 
{
 public static void main(String agrs[])
 {
 Scanner Sc = new Scanner(System.in);
 System.out.println("what is your salery:");
 float salery = Sc.nextFloat();
 float TAX = (salery)*5/100;
 float tax2 = TAX+(salery)*20/100;
 float tax3 = tax2+(salery)*25/100;
 if (salery < 2.5){
 System.out.println("There will be no tax charged on him");
 }  
 else if (salery >=2.5 && salery <=5.0 ) {
 System.out.println("Tax will be charged 5% "+ TAX);
 }
 else if (salery >= 5.0 && salery <= 10.0 ){
 System.out.println("the tax is : " + tax2);
 }
 else if (salery > 10.0 && salery <= 15.0 ){
 System.out.println("the tax is : " + tax2);
 }
 /*System.out.println("Enter the number:");
 int day = Sc.nextInt();
 switch(day){
 case (1):  System.out.println("Monday");
 break;
 case (2):  System.out.println("Tuesday");
 break;
 case (3):  System.out.println("Wednesday");
 break;
 case (4):  System.out.println("Thrusday");
 break;
 case (5):  System.out.println("Friday");
 break;
 case (6): System.out.println("Saturday");
 break;
 case (7):  System.out.println("SUNDAY");
 break;*/
 // program
 /*
 System.out.println("Plese enter the website");
 String website = Sc.next();
 if(website.endsWith(".com")){
 System.out.println("This is commercial website");

 }
 else if(website.endsWith(".in")){
 System.out.println("This is indian website");
}
 */
 
 
  
 }
 }