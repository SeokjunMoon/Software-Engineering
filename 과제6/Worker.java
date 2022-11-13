package refactoring.extractclass.before;

public class Worker {
	private String name;
	private PhoneNumber phoneNumber;


	public Worker(String name, String officeAreaCode, String officeNumber) {
		super();
		this.name = name;
		phoneNumber = new PhoneNumber(officeAreaCode, officeNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficeAreaCode() {
		return phoneNumber.getOfficeAreaCode();
	}

	public String getOfficeNumber() {
		return phoneNumber.getOfficeNumber();
	}
	
	public String getPhoneNumber() {
		return phoneNumber.getPhoneNumber();
	}
}
