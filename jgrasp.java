package com.company;
import  java.util.*;
public class jgrasp
{
 public static void main(String args[])
 {
 //program to find perentage . By using Scanner class.
 Scanner sc = new Scanner (System.in);
 System.out.println("Maths :");
 double a = sc.nextInt(); 
 System.out.println("Science :" );
 double b = sc.nextInt();
 double total = ( a + b );
 double percentage = (total/200.0)*100.0;
 System.out.println("Total marks is :" + total );
 System.out.println("Percentage :" + percentage );
 }
}