/* Question - 17

Java Program To Convert Decimal Number(Postive Number) To Binary Number

*/

package com.faq.imp.program;
 
 
public class DectoBinary { 
     
  public static void main(String[] args) { 
  
   int Num=8,Bin=0,Rem=0,Place=1,Var; 
    
   System.out.println("Decimal No: "+Num); 
    
   Var = Num; 
    
   while(Num!=0) { 
    Rem = Num % 2; 
     
    Num = Num / 2; 
     
    Bin = Bin +(Rem*Place); 
     
    Place = Place * 10; 
   } 
  
   System.out.printf("Convertion Of Decimal %d To Binary Number Is : %d",Var,Bin); 
  } 
}