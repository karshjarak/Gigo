package basic;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a =0;
		int b=1;
		
		for(int i=0; i<10; i++) {
			
		
			 int c = a+b;
			 System.out.println(c);
			 a=b;
			 b=c;
			
		}
		
//		
//		int n =121;
//		int rem;
//		int rev =0;
//		
//		int temp =n;
//		
//		while(temp!=0) {
//			
//			rem = temp%10;
//			rev = rev*10+rem;
//			temp = temp/10;
//			
//		}
//		
//		if(n==rev) {
//			
//			System.out.println("palindrome number"+n);
//		}else {
//			
//			System.out.println("not a palindrome number"+n);
//		}
//
//	}

}
}
