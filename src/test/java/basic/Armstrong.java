package basic;

import java.util.Scanner;

import com.mongodb.internal.operation.SyncOperations;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("enter the new number");
		
		int n = s1.nextInt();
		
		//int n = 153;
	
		// length of number

		int temp = n;
		int length = 0;
		
		while (temp != 0) {
			
			length = length + 1;
			temp = temp / 10;
			

		}
		int temp2 = n;
		int arm = 0;
		
		while (temp2 != 0) {
			
			int rem;
			
			int mul = 1;
			
			rem = temp2 %10;

			for (int i = 0; i < length; i++) {

				mul = mul * rem;

			}
			arm = arm + mul;
			temp2 =temp2/10;

		}

		if (n == arm) {
			System.out.println("no is boolean" + n + " vh" + arm);

		}
		else {
			
			System.out.println("not a arm strong number");
		}

	}

}
//153/10;
