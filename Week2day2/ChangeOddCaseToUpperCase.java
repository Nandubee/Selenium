package Week2day2;

public class ChangeOddCaseToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeOddCaseToUpperCase upper = new ChangeOddCaseToUpperCase();
		upper.upperCase();

	}
	
	
	public void upperCase() {
		
		String change ="changeme";
		char[] toupper= change.toCharArray();
		for (int i = 0; i < toupper.length; i++) 	
		
		{
			
			if(i%2 == 1) {
								
				 toupper[i] = Character.toUpperCase(toupper[i]);
			}
		}
				String modifiedString = new String(toupper);
		        System.out.println(modifiedString);
			}
			
		
		
		
		}
	