package youmans_p1;
import java.util.Scanner;
public class DECRYPT {
	public static void main(String[] args) {
	Scanner scns = new Scanner(System.in); 
    System.out.println("Enter the four digit number you want to decrypt");
    int Digit = scns.nextInt();  
    int x;
    int Digit1 = Digit/1000;
    int remainder = Digit%1000; 
    int Digit2 = remainder/100; 
    remainder =  remainder%100; 
    int Digit3 = remainder/10; 
    remainder = remainder%10;  
    int Digit4 = remainder;  
    x = Digit1;
    Digit1 = Digit3; 
    Digit3 = x; 
    x = Digit2;  
    Digit2 = Digit4; 
    Digit4 = x;    
    x = 0;
    int []Digits = new int[4]; 
    Digits[0] = Digit1; 
    Digits[1] = Digit2; 
    Digits[2] = Digit3; 
    Digits[3] = Digit4; 
    while (x<4) {
    	 
    	 if (Digits[x]>=6) {
    	  Digits[x] = Digits[x]-7; 
    	 } 
    	 else { 
    		 Digits[x] = (Digits[x]+10)-7;
    		 
    	 } 
    	 x = x+1;
    }
    System.out.println(""+Digits[0]+Digits[1]+Digits[2]+Digits[3]);
}
}