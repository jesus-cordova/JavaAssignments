package basics;

import java.util.Arrays;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		// 1.
//		System.out.println("enter bkn");
//		long  numb = myScanner.nextLong();
//		myScanner.nextLine();
//		System.out.println("enter name");
//		String nameOne = myScanner.nextLine();
//		System.out.println("enter author");
//		String author = myScanner.nextLine();
//		System.out.println("enter price");
//		double price = myScanner.nextDouble();
//		System.out.println("enter num of copies");
//		int copies = myScanner.nextInt();
//		
//		System.out.println("bkn: " + numb + " name: " + nameOne + " author: " + author + " $price: " + price + " copies: " + copies  );

		// 2.
//		System.out.println("Please ener the divdend");
//		int dividend = myScanner.nextInt();
//		System.out.println("Please ener the divsor");
//		int divisor = myScanner.nextInt();
//		
//		System.out.println("this is the quotient " + dividend/divisor);
//		System.out.println("this is the remainder " + dividend%divisor);

		// 3.
//		int[] swapArray = {3, 4};
//		int temp = swapArray[0];
//		swapArray[0] = swapArray[1];
//		swapArray[1] = temp;
//		System.out.println(Arrays.toString(swapArray));

		// .4
//		int[] swapArray = {3, 4};
//		swapArray[0] = swapArray[0] + swapArray[1];
//		swapArray[1] = swapArray[0] - swapArray[1];
//		swapArray[0] = swapArray[0] - swapArray[1];	

//		System.out.println(Arrays.toString(swapArray));

		// 5

//
//		System.out.println("Please enter a lettin in the alphabet:");
//		char inputChar = myScanner.next().charAt(0);
//
//		if (inputChar == 'a' | inputChar == 'e' | inputChar == 'i' | inputChar == 'o' | inputChar == 'u')
//			System.out.println("this is vowel");
//		else
//			System.out.println("this is consonant");
//

		// 6
//		System.out.println("Please enter a lettin in the alphabet:");
//		char inputChar = myScanner.next().charAt(0);
//		
//		switch (inputChar)
//		{
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//			System.out.println("this is a vowel");
//			break;
//		default:
//			System.out.println("this is a consonant");
//		
//			
//		}

		// 7
//		System.out.println("Pleas enter a year ");
//		int year = myScanner.nextInt();
//		boolean leap;
//		if (year % 4 == 0) {
//			if (year % 100 == 0) {
//				if (year % 400 == 0)
//					leap = true;
//				else
//					leap = false;
//
//			} else
//				leap = true;
//		}
//		leap = false;
//		if (leap)
//			System.out.println("this is a leap year ");
//		else
//			System.out.println("this is not a leap year ");

		// 8
//		System.out.println("enter a number");
//		int number = myScanner.nextInt();
//		if (number < 0)
//			System.out.println( "this is a negative");
//		else 
//			System.out.println("this is a positive");
		// 9
//		System.out.println("enter min number");
//		int min = myScanner.nextInt();
//		System.out.println("enter max number ");
//		int max = myScanner.nextInt();
//		
//		for (int i = min; i < max; i++ )
//		{
//			if( i % 2 == 0 | i % 3 == 0 |i % 5 == 0 |i % 7 == 0 |i % 11 == 0 )
//			{
//			 System.out.println(i + " this is not a prime number");
//			}
//			else {
//				
//			 System.out.println(i + " this is a prime number");
//			}
//				
//		}

		// 10
//		System.out.println("enter base ");
//		int base = myScanner.nextInt();
//		System.out.println("enter power");
//		int powerRaised = myScanner.nextInt();
//
//		int result = power(base, powerRaised );
//		System.out.println(base + "^" + powerRaised + "=" +  result);

		// 11
		System.out.println("enter something ");
		String input = myScanner.nextLine();
		int vowelCounter =0;
		int consonantsCounter =0;
		int numberCounter =0;
		int spaceCounter= 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i))) {
				// check for vowel
				if (input.charAt(i) == 'a' | input.charAt(i) == 'e' | input.charAt(i) == 'i' | input.charAt(i) == 'o' | input.charAt(i) == 'u') {
					vowelCounter++;
				}
				else 
					consonantsCounter++;

			} else if (Character.isDigit(input.charAt(i))) {
				 numberCounter++;
			} else
				spaceCounter++;
		}
		System.out.println("vowels  " + vowelCounter + " consononant " + consonantsCounter + " numbers " + numberCounter + " spces " + spaceCounter);
	}
//		public static int power(int base, int powerRaised)
//		{
//			if(powerRaised == 0)
//				return 1;
//			else 
//				return (base * power(base, powerRaised -1 ));
//		}
}
