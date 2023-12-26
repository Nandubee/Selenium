package Week1.day1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile myMobile = new Mobile();
		System.out.println("This is my Mobile");
		System.out.println("------------------");
		myMobile.makeCall();
		myMobile.sendMsg();
	}
	public void makeCall()
	{
		String moblieModel="Iphone 14promax";
		float mobileWeight=120;
		System.out.println("Mobile Model= "+moblieModel);
		System.out.println("Mobile Weight= "+mobileWeight);
		
		
	}
	public void sendMsg()
	{
		boolean isFullRecharged=true;
		int mobileCost=120000;
		System.out.println("Is Full Recharged= "+isFullRecharged);
		System.out.println("Mobile Cost= "+mobileCost);
		
	}

}
	
