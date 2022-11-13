package refactoring.movemethod.before;

public class Account {
	private static final double basicCharge = 4.5;
	private int daysOverdrawn;
	private AccountType type;
	
	public double bankCharge() {
		double result = basicCharge;
		final boolean Overdrawned = daysOverdrawn > 0;
		
		if (Overdrawned) 
			result += type.overdraftCharge(daysOverdrawn);
		return result;
	}
	
	public int getDaysOverdrawn() {
		return daysOverdrawn;
	}
}

