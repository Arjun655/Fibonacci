//package Fibonacci;

import java.util.Scanner;

public class Fibonacci

{
    
    public static void main(String []args)

  {
    
   int i,c=0,n;
   
   Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a number to generate Fibonacci series upto nth term ");
   
     n=sc.nextInt();
   
    int a=0;
   
    int b=1;
   
    System.out.println("Fibonacci series upto "+n+" is: ");
  
     while(c<=n)
   
     {
        
       System.out.println(c+" ");
    
   
        a=b;
      
        b=c;
    
        c=a+b;
   
     }
 
   
   }

} 