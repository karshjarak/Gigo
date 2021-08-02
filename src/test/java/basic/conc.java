package basic;

 public class conc extends magic{
	 
	 
	 @Override
		public void concurrent() {
			// TODO Auto-generated method stub
			System.out.println("hello karshak");
		}
	 
	 public void childmethod() {
		 
		 System.out.println("child method");
	 }
	
	public static void main(String[] args) {

		
		  magic c = new conc();
		      conc d = (conc)c; 
		      
		      d.hello();
		      d.childmethod();
		      d.concurrent();
		      
		      
//		  c.concurrent();
//		  c.hello();
//		 
		              
                     
		
	}


}

class  magic {
	
	public void concurrent() {

		System.out.println("heye");
	}

	public void hello() {
		
		System.out.println("blank");
	}

	

	
}