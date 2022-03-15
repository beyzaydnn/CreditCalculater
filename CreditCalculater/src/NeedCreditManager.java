
public class NeedCreditManager implements Credit {

	@Override
	public void calculate(double price, int year) {
		double totalPrice = price + price*year*(0.21);
		
		System.out.println(" Need Credit Price is : " + totalPrice);
	}

}
