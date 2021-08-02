package basic;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// armstrong
		// prime number
		// palindrome number
		// factorial
		// fibonici
		// string reverse

		// vowuels
		// sum of 2nd array
		// occurnece of character in string
		// count of capital and small
		// remove duplicate in string
		// swap two numbers

		// java interview questions
		// java program questions

		// selenium interview questions
		// selenium program questions

		// sql
		// api

		//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//		int a =10;
//		int b = 20;
//		
//		 int t =a;
//		
//			System.out.println("before swapping");
//
//		System.out.println(a);
//		System.out.println(b);
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println(a);
//		System.out.println(b);

		
		
		
		
		
		
		
//
//		int x = 15;
//		int y = 14;
//		int temp;
//
//		System.out.println("before swap");
//		System.out.println(x);
//		System.out.println(y);
//
//		temp = x;
//		x = y;
//		y = temp;
//
//		System.out.println(x);
//		System.out.println(y);

//		
//		
//		String abc = "karshak";
//		
//		
//		for(int i=0; i<abc.length(); i++) {
//			
//			
//			for(int j=i+1; j<abc.length(); j++) {
//				
//				
//				if(abc.charAt(i)==abc.charAt(j)) {
//					
//					
//					System.out.println(abc.charAt(i));
//						
//				}
//			}
//		}
//		

//		String a = "ASgh@76";
//
//		int upper = 0;
//		int lower = 0;
//		int number = 0;
//		int special = 0;
//
//		for (int i = 0; i < a.length(); i++) {
//
//			Character ch = a.charAt(i);
//
//			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
//				upper++;
//			} else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
//				lower++;
//			} else if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
//				number++;
//			} else {
//				special++;
//			}
//
//		}
//		
//		System.out.println(upper);
//		System.out.println(lower);
//		System.out.println(number);
//		System.out.println(special);

//
//		String a = "aeioukarshak";
//		
//		int count=0;
//
//		for (int i = 0; i < a.length(); i++) {
//
//			Character c = a.charAt(i);
//			
//			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//				
//				count++;
//			}
//
//		}
//		
//		System.out.println(count);

//		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
//		
//		int sum = 0;
//
//		for (int i = 0; i < a.length; i++) {
//
//			for (int j = 0; j < a[i].length; j++) {
//
//				sum = sum + a[i][j];
//				
//			}
//			System.out.println(sum);
//		}
//		

//
//		String b = "karshak";
//
//		Character search = 'a';
//
//		int count = 0;
//
//		for (int i = 0; i < b.length(); i++) {
//
//			if (b.charAt(i) == search) {
//
//				count++;
//			}
//
//		}

//		String abc = "karshak";
//	
//		char[] c = abc.toCharArray();
//		
//		
//		
//		for(int i =c.length - 1; i >0; i--) {
//			
//		System.out.println(c[i]);
//			
//		}

//		
//		int n=5;
//		int fac=1;
//		
//		for(int i=1; i<=5; i++) {
//		
//			fac = fac*i;
//			
//		}
//		
//		System.out.println(fac);
//		
//		

//
//		int a = 0;
//		int b = 1;
//		int sum = 0;
//
//		for (int i = 0; i < 10; i++) {
//			sum = a + b;
//			System.out.println(sum);
//			a = b;
//			b = sum;
//
//		}

		// 121

//		
//		int n =122;
//		
//		int temp=n;
//		int rem;
//		int rev=0;
//		
//		while(temp!=0) {
//			
//			rem = temp%10;
//			
//			rev = rev *10 + rem;
//			 temp = temp/10;
//		}
//		 if(rev==n) {
//			 
//			 System.out.println("is a palindrome");
//		 }
//		 else {
//			 
//			 System.out.println(" is a not a palindrome");
//		 }

		// prime number

		// 1 3 5 7 9 11 13
		// 6

		// 1, 6
//
//		int n = 5;
//
//		int temp = 0;
//
//		for (int i = 2; i < n - 1; i++) {
//
//			if (n % i == 0) {
//
//				temp = temp + 1;
//
//			}
//		}
//
//		if (temp > 0) {
//
//			System.out.println("is not a prime number");
//		} else {
//			System.out.println("is a prime number");
//		}

		// armstrong number

		// 153

//		int n = 153;
//		int rem;
//		int temp = n;
//		int length = 0;
//		
//		int sum = 0;
//
//		int temp2 = n;
//		
//
//		while (temp!= 0) {
//
//			temp = temp / 10;
//			length  = length  + 1;
//		}
//
//		while (temp2!= 0) {
//			
//			int rev = 1;
//			
//			rem = temp2 % 10;
//
//			for (int i = 0; i < length ; i++) {
//
//				rev = rev * rem;
//
//			}
//
//			sum = sum + rev;
//			temp2 = temp2 / 10;
//			System.out.println(sum);
//
//		}
//		if (n == sum) {
//
//			System.out.println("is a palindrome number");
//
//		} else {
//			System.out.println("not a palindrome number");
//		}
//		

		// System.out.println(length);

//		
////		
////		String h ="A@gjdgF1";
////		
////	char[] str = h.toCharArray();
////		
////		    int upper = 0, lower = 0, number = 0, special = 0;
////		    
////		    for (int i = 0; i < str.length; i++)
////		    {
////		        if (str[i] >= 'A' && str[i] <= 'Z')
////		            upper++;
////		        
////		        else if (str[i] >= 'a' && str[i] <= 'z')
////		            lower++;
////		        
////		        else if (str[i]>= '0' && str[i]<= '9')
////		            number++;
////		        
////		        else
////		            special++;
////		    }
////		    
////		    System.out.println(upper);
////		    System.out.println(lower);
////		    System.out.println(number);
////		    System.out.println(special);
////
////		}
//	

//		String a = "karshakk";
//		
//	char[]	c = a.toCharArray();
//	
//	
//	for(int i=0; i<c.length; i++) {
//		
//		for(int j=i+1; j<c.length; j++) {
//			
//		
//			if(c[i]==c[j]) {
//				
//				System.out.println(c[i]);
//		}
//		}
//	}

//	
//		String  city = "hyderabad";
//		
//		Character search = 'a';
//		int count =0;
//		
//		
//		for(int i=1; i<city.length(); i++) {
//			
//			if(city.charAt(i)==search) {
//				
//				count++;
//			}
//		}
//		System.out.println(count);
//		

//		String rev = "";
//		
//		String org ="mam";
//		
//		
//		
//		StringBuilder b = new StringBuilder();
//		
//		b.append(org);
//		
//		b.reverse();
//		System.out.println(b);

//		Scanner in = new Scanner(System.in);
//
//		System.out.println("enter the string");
//
//		org = in.nextLine();
//
//		int length = org.length();
//
//		for (int i = length - 1; i >= 0; i--) {
//
//			rev = rev + org.charAt(i);
//			System.out.println(rev);
//
//		}
//		if(rev.equals(org)) {
//			
//			System.out.println("palidnrome");
//		}
//		else {
//			
//			System.out.println("not a palindrome");
//		}

	}
}