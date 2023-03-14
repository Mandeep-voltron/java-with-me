public class array___55
{
public static void main(String args[])
{
int mata[][]=new int[2][3];
mata[0][0]=801;
mata[0][1]=802;
mata[0][2]=803;
mata[1][0]=901;
mata[1][1]=902;
mata[1][2]=903;
System.out.println("Printing an 2-D array:");


for(int a=0; a<mata.length;a++){
 for(int b=0; b<mata[a].length;b++){
 System.out.print(mata[a][b]);
 System.out.print(" "); 
 }
 System.out.println(" ");
}
}
}