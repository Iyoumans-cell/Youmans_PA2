import java.util.Scanner;
public class BMI {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
				System.out.println("Input 0 for calculating BMI using inches and pounds or 1 for meters and kilograms."); 
         int Choice = scnr.nextInt();  
         double Height; 
         double Weight; 
         Double BMI;
         if (Choice == 0) {  
         System.out.println("Enter your height in inches:"); 
         Height = scnr.nextDouble(); 
         System.out.println("Enter your weight in pounds:"); 
         Weight = scnr.nextDouble();
         BMI = (703*Weight)/(Math.pow(Height,2)); 
         System.out.println("Your BMI is:"+ BMI); 
         System.out.println("Underweight = <18.5"); 
         System.out.println("Normal Weight = 18.5-24.9"); 
         System.out.println("Overweight = 25-29.9");
         System.out.println("Obese = BMI of 30 or greater");
        
         } 
         else if (Choice == 1) { 
        	 System.out.println("Enter your height in meters:"); 
             Height = scnr.nextDouble(); 
             System.out.println("Enter your weight in Kilograms:"); 
             Weight = scnr.nextDouble();
             BMI = (Weight)/(Math.pow(Height,2)); 
             System.out.println("Your BMI is:"+ BMI);   
             System.out.println("Underweight = <18.5"); 
             System.out.println("Normal Weight = 18.5-24.9"); 
             System.out.println("Overweight = 25-29.9");
             System.out.println("Obese = BMI of 30 or greater");
        	  
         } 
         else {
        	System.out.println("Invalid response");   
        	  
         }
         
	}

}
