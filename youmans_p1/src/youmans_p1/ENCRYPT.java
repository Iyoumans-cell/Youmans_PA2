package youmans_p1;
import java.util.Scanner;
public class ENCRYPT {

	public static void main(String[] args) {
		 Scanner scnr = new Scanner(System.in);  
		    System.out.println("Enter a four digit number"); 
		    int x;;
		    int Digit = scnr.nextInt(); 
		    int Digita = Digit/1000;
		    int remainder = Digit%1000; 
		    int Digitb = remainder/100; 
		    remainder =  remainder%100; 
		    int Digitc = remainder/10; 
		    remainder = remainder%10; 
		    int Digitd = remainder;
		    Digita = (Digita+7)%10; 
		    Digitb = (Digitb+7)%10;
		    Digitc = (Digitc+7)%10; 
		    Digitd = (Digitd+7)%10; 
		    x = Digita; 
		    Digita = Digitc;
		    Digitc = x; 
		    x = Digitb; 
		    Digitb = Digitd;
		    Digitd = x; 
		    System.out.println("" + Digita+Digitb+Digitc+Digitd); 

	}

}
