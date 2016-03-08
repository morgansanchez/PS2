package base;

import java.util.Scanner;



public class MyInteger {
	//defines the name of the integer
	int number;
	
		
	

		public MyInteger(int number) {
				this.number = number;
	}


		public static boolean isEven(int number) {
			// checks if even
			if (number % 2 == 0){
	            return true;
	        }
	        return false;
		}
		
		public static boolean IsOdd(int number) {
			// checks if odd
			 if(number % 2 != 0){
	            return true;
	        }
	        return false;
		}

		//check to see if prime
	    public boolean isPrime() {
	        int n = 0;
	        for (n = 2; n <= number / 2; n++) {
	            if (number % n != 0) {
	                return true;
			}
	      }
	        return false;
	       
	          

		} 
	    public static boolean isPrime(MyInteger value) {
	        return isPrime(value);
	    }

		public static boolean isEven(MyInteger value) {
			return isPrime(value);
	    }

		public static boolean isOdd(MyInteger value) {
			return isPrime(value);
	    }

}
	    
	    

	    
	
