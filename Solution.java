import java.util.*;

public class Solution {


    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     int n = sc.nextInt();
     int y  = n%2;
     if(y!=0){
         System.out.println("Weird");
     }
      else if(n>=2 && n>=5 && y!=0){
          System.out.println("Not Weird");
      }
       else if (n>=6 && n>=20 && y!=0)
    {
        System.out.println("Weird");
    }
    
    else{
        System.out.println("Not Weird");
    }
    
    
    
    
   
    }
}
