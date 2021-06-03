package basics;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// .1
//		for (int i=1; i <=10; i++ )
//		{
//			for (int j=1; j<=10; j++) 
//			{
//				System.out.println(i + "x" + j + "="+ i*j);
//			}
//		}
		// 2
//		 for (int i= 1; i<=10 ; i++ )
//		 {
//			 System.out.println(getFibonacci(i));
//		 }
		// 3
//		char c; 
//		for (c = 'a'; c <= 'z'; ++c)
//		{
//			System.out.print(c + "");
//		}
		// 4
//		int num = 4567;
//		int reversed = 0;
//		while (num !=  0) {
//			int digit = num % 10;
//			reversed = reversed * 10 + digit;
//			num = num/10;
//		}
//		System.out.println(reversed);
		   
		
		
//		int[][] board = { { 1, 2, 3, 4 }, {5, 6, 7, 8, 9, 10 } };
//		int sum = 0; 
//
//		for (int row = 0; row < board.length; row++) {
//			for (int col = 0; col < board[row].length; col++) {
//				System.out.print(board[row][col] + "");
//				sum = sum + board[row][col];
//			}
//			System.out.println();
//		}
//         System.out.println(sum);{

		
		
		
	}

	public static int getFibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		int first = 0;
		int second = 1;
		int nth = 1;

		for (int i = 2; i <= n; i++) {
			nth = first + second;
			first = second;
			second = nth;
		}
		return nth;
	}
}
