package Week2.day1;
import java.util.Arrays;
public class FindMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={1,4,3,2,8,6,7};
		Arrays.sort(a);
		
			for (int i = 0; i < a.length; i++) {
				if((i+1)!=a[i])
				{
					System.out.println("Missing number - "+(i+1));
					break;
				}
			}

		}

	}
	