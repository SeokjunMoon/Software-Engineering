package refactoring.extractclass.before;

public class PhoneNumber {
	private String officeAreaCode;
	private String officeNumber;


	public PhoneNumber(String officeAreaCode, String officeNumber) {
		super();
		this.officeAreaCode = officeAreaCode;
		this.officeNumber = officeNumber;
	}
	
	public String getOfficeAreaCode() {
		return officeAreaCode;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public String getPhoneNumber() {
		return getOfficeAreaCode() + "-" + getOfficeNumber();
	}

	public void setOfficeAreaCode(String officeAreaCode) {
		this.officeAreaCode = officeAreaCode;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
}