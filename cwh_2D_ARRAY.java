public class cwh_2D_ARRAY
{
 public static void main(String args[])
 {
 //Making and printing 2d array
 int [][] flats=new int[2][3];
 flats[0][0]=101;
 flats[0][1]=102;
 flats[0][2]=103;
 flats[1][0]=201;
 flats[1][1]=202;
 flats[1][2]=203;
 
 // method to print 2-d array.
 for (int i=0; i<flats.length;i++){
   for(int j=0; j<flats[i].length; j++){  //(j<flats[i].length) means iske ander ke array ki lenght tak
     System.out.print(flats[i][j]);
     System.out.print(" ");
}
System.out.println("");
}

 }
} 