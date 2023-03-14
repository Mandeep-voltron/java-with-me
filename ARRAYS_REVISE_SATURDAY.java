public class ARRAYS_REVISE_SATURDAY
{
   public static void main(String args[])
   {
    int array [][]= new int[2][3];
      array [0][0]=67; 
      array [0][1]=68; 
      array [0][2]=69; 
      array [1][0]=61; 
      array [1][1]=45; 
      array [1][2]=67;
   //printing an array using loop. 
      for(int a=0;a<array.length;a++){
         for(int j=0;j<array[a].length;j++){
            System.out.print(array[a][j]);
            System.out.print(" ");
         }
         System.out.println("");
      }
     System.out.println("Done");
      
      
     
   }
}