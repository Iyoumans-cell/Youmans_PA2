package youmans_p3;

import java.util.Scanner;

public class TOPIC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String[] topics = new String[5];   
		int[][]response = new int[5][11];   
		double[] sum = new double[5];
		int k; 
		int x;
		int lowVal = 0;;
		int highVal = 0;
		int numPeople = 1;
		int keepTrack1 = 0;
		int keepTrack2 = 0; 
		topics[0] = "The Stormlight Archive"; 
		topics[1] = "The first Law Trilogy "; 
		topics[2] = "Discworld             "; 
		topics[3] = "The Wheel of time     ";
		topics[4] = "Earthsea              ";  
		String text = "yes";
		String answer = "yes"; 
		
		while(text.compareTo(answer) == 0) {
		
	    x = 0;
		while (x<5) {    
	    
        k = 0;
		System.out.println("On a scale of 1-10 with 10 being the most important fantasy series and 1 being the lowest fantasy series how would you rate " + topics[x]); 
		k = scan.nextInt(); 
	    response[x][k] += 1;       
	    sum[x] += k;   
        if ((x == 0) && (numPeople == 1)) {
        	 lowVal = (int)sum[x];
        	 highVal = (int)sum[x];
        }  
        if (highVal<sum[x]) { 
        	highVal = (int)sum[x]; 
        	  keepTrack1 = x;
        } 
         
        x = x+1;
		}    
		  
		System.out.println("Does another person want to take the survey,yes or no?"); 
		answer = scan.next(); 
		 
		if ( (text.compareTo(answer))== 0 ) {
			numPeople = numPeople+1;
		}
		
		}  
		lowVal = highVal;
		for (int i = 0;i<5;i++) { 
			if (lowVal<sum[i]) { 
				 lowVal = (int)sum[i]; 
				 keepTrack2 = i;
				System.out.println(lowVal);
			}
			 
			  
		}
		
		x = 0;
		while (x<5) {
        System.out.print(topics[x]+ " "); 
		for(k=1;k<=10;k++) {
	    System.out.print("" + response[x][k]+" ");   
		}     
	     Double avg = sum[x]/numPeople;
		System.out.printf("Avg:%.2f " ,avg);
		System.out.println("");
		x = x+1;
		} 
		System.out.println("");
		System.out.println("The topic with the highest value is "+ topics[keepTrack1] + "\nwith a total score of "+ sum[keepTrack1] );
		System.out.println("The topic with the lowest value  is "+ topics[keepTrack2] + "\nwith a total score of "+ sum[keepTrack2] );	 

	}

}
