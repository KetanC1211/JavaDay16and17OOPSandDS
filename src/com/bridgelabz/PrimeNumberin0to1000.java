package com.bridgelabz;

public class PrimeNumberin0to1000 {

	// function which checks whether a number is Prime or Not
	// If the number is prime, it returns true. Else, it returns false.
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
		for (int i = 0; i <= 1000; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
