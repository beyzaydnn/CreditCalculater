
public class Main {

	public static void main(String[] args) {
		
		Credit[] credits = {new CarCreditManager(), new NeedCreditManager(), new OfficerCreditManager()};
		
		Application application = new Application(credits);
		application.customerApplication(5000, 3);
		}

	}


