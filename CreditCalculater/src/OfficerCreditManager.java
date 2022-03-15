
public class OfficerCreditManager implements Credit {

	@Override
	public void calculate(double price, int year) {
		double totalPrice =  price + price*year*0.2;
		
		System.out.println("Officer Credit Price is :" + totalPrice);
	}
	
	
}
