package primefactorization;

import java.util.*;

public class primeFactorization {
	
	public static void main(String[] args) {

		// INITIALIZATION
		int n;
		Scanner sc = new Scanner(System.in);
		
		// INPUT DATA
		System.out.print("Enter a Number : ");
		n = sc.nextInt();

		// COMPUTATION
		System.out.print("The Prime Factors of " + n + " are : ");

		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			} else
				i++;
		}
		System.out.println(" ");
	}
}
