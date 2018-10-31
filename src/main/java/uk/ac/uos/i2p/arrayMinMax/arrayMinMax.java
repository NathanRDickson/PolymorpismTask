package main.java.uk.ac.uos.i2p.arrayMinMax;
import java.util.Arrays; 
import java.lang.Math;

public class arrayMinMax {
	   
	

    
	public static void main(String[] args) 
	    { 

	        double[] arr = {17,89, 27, 11, 91, 42, 73, 90, 5, 5}; 
	  
	        Arrays.sort(arr); 
	  
	        System.out.printf("The full array is arr[] : %s", 
	                          Arrays.toString(arr));
	        
	        System.out.printf("\nThe min value is: " + arr[0]);
	        System.out.printf("\nThe max value is: " + arr[9]);
	        
	        int diff = (int) (arr[9] - arr[0]);
	        System.out.printf("\nThe range is: " + diff);
	        
	        int sum = 0;
	        for (int x = 0; x <= 9; x++) {
	            sum = (int) (sum + arr[x]); 
	        } 
	        double mean = sum / 10;
	        System.out.printf("\nThe mean value is: " + mean);
	        
	        // Stuff 
	        
	        double SD = calculateSD(arr);
	        
	        System.out.printf("\nThe mean Standard Deviation is: " + SD);
	    } 
	
	
	    public static double calculateSD(double numArray[])
	    {
	        double sum = 0.0, standardDeviation = 0.0;
	        int length = numArray.length;
	
	        for(double num : numArray) {
	            sum += num;
	        }
	
	        double mean = sum/length;
	
	        for(double num: numArray) {
	            standardDeviation += Math.pow(num - mean, 2);
	        }
	
	        return Math.sqrt(standardDeviation/length);
	    }
	   

}
