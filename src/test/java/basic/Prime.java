package basic;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5;
		
		int temp =0;
		
		for(int k=2; k<n-1; k++) {
			
			
			if(n%k==0) {
				
				temp = temp+1;
				
			}
		}
		
		if(temp>0) {
			
			System.out.println("is not a prime number"+n);
		}
		
		else {
			System.out.println("is  a prime number"+n);

			
		}

	}

}
