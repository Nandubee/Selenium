package Week2day2;

public class ReverseOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseOdd rev=new ReverseOdd();
		rev.revodd();
	}

	public void revodd() {
		String test = "I am a software tester";
		String[] r=test.split(" ");
		
		for (int i = 0; i < r.length; i++) {
			if((i%2)==1)
			{
			char[] r2=r[i].toCharArray();
			for (int j =r2.length-1;j>=0; j--) {
				System.out.print(r2[j]);	
				
				
			}
			}
			else {
				
				System.out.print(r[i]);
			}
				 	
			
			System.out.print(" ");	
			  
				 
			 }
				 }
					
		}
	   
	
	

