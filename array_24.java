public class array_24
{
 public static void main(String args[])
{
 int [] marks  = new int [5];
 marks [0] = 100;
 marks [1] = 80;
 marks [2] = 60;
 marks [3] = 88;
 marks [4] = 90;
 
 
 /* way to display an array
 System.out.println(marks[3]);
  // way to display an array using an loop in reverse order
  for (int i=4; i<marks.length && i>=0;i--){
  System.out.println(marks[i]);
  } */
  
  
  /* way to display an array using an loop horizontly
  for (int i=0; i<marks.length;i++){
  System.out.print(marks[i]);
  System.out.print(" ");
    }*/
    
    
   /*way to display an array using an loop vertically
  for (int i=0; i<marks.length;i++){
  System.out.print(marks[i]);
  }*/
  
  // diffrent ways to make an array
  
   // first 
   int[] india; //declaration
   india = new int [3]; //memory allocation
    marks [0] = 50;
    marks [1] = 90;
    marks [2] = 70;
    
    //second we have seen above(declaration + memory allocation)
    
    // third(declare+initialize)
    int[]money={55,66,77,88,99};// note this semi colon (array start from 0 to  array.lengthc- 1)
    System.out.println(money[4]);
  
 }
}