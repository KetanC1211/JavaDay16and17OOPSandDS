package com.bridgelabz;
import java.util.ArrayList;

public class ExtnOfPrimeToCheckPalindrome {

	public static void palindromeChecker(int n){  
		 
		  int r,sum=0,temp;
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}  
	 
	public static boolean isPrime(int n) {
		// 0 and 1 are neither prime nor composite numbers
		if (n == 0 || n == 1) {
			return false;
		}
		// 2 is a prime number
		if (n == 2) {
			return true;
		}
		// every composite number has a prime factor
		// less than or equal to its square root.
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	
	}
	
	public static void main(String[] args) {
		ArrayList <Integer> primeArray = new ArrayList<>();
		for (int i = 0; i <= 1000; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				primeArray.add(i);
			}
		}
		System.out.println();
		System.out.println(primeArray);
	
		for (int j =0;j<primeArray.size();j++) {
			System.out.print(primeArray.get(j)+": ");
			palindromeChecker(primeArray.get(j));
			System.out.println();
			
		}
	}
}

