package Week2.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int n=15;
		System.out.println("Fibonacci Series");
		for(int i=1;i<=n;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
	}

}
	}
