package base;

import java.util.Scanner;



public class MyInteger {
	//defines the name of the integer
	private static int MyNumber;
	
		
	

		public MyInteger(int number) {
			MyNumber = number;
	}

		public int getInteger(){
		
		return MyNumber;
		}
		public static boolean isEven() {
			// checks if even
			if (MyNumber % 2 == 0){
	            return true;
	        }
	        return false;
		}
		
		public boolean IsOdd() {
			// checks if odd
			 if(MyNumber % 2 != 0){
	            return true;
	        }
	        return false;
		}

		//check to see if prime
	    public boolean isPrime() {
	        int n = 0;
	        for (n = 2; n <= MyNumber / 2; n++) {
	            if (MyNumber % n != 0) {
	                return true;
			}
	      }
	        return false;
	                
		} 
	    

		public static boolean isEven(MyInteger MyNumber) 
		{
			return MyInteger.isEven(MyNumber.getInteger());
		}
	
		public static boolean isOdd(MyInteger MyNumber) 
		{
			return MyInteger.isOdd(MyNumber.getInteger());
		}

		public static boolean isPrime(MyInteger MyNumber) 
		{
			return MyInteger.isPrime(MyNumber.getInteger());
		}
		
		public boolean equals(MyInteger MyNumber) 
		{
			return equals(MyNumber.getInteger());
		}
		
		

	}


	    
	
