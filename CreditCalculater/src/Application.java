
public class Application {

	private Credit[] credits;
	
	
	public Application(Credit[] credits) {
		
		this.credits = credits;
		
	}
	
	void customerApplication(double price,int year) {
		if(credits.length == 0) {
			System.out.println("l�tfen kredi t�r� giriniz!");
		}
		else {
			for(Credit credit :credits) {
				credit.calculate(price, year);
			}
		}
	}
	
}
