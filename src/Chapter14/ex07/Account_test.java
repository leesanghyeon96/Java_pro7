package Chapter14.ex07;

public class Account_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1 = new Account();
		try {
			a1.withdrow(500);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		
		
		
	}

}
