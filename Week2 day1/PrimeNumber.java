package Week2.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		for(int i=2;i<=n/2;i++)
		{
			if((n%i)==0)
			{
			System.out.println("Given number is non Prime Number - "+n);
			break;
			}
			else 
			{
				System.out.println("Given number is Prime Number"+n);
				break;
	}
		}
	}
}

