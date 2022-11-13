package refactoring.splittemporaryvariable.before;

public class Rectangle {
	private int width, height;
	
	public void printInfo() {
		printLength();
		printArea();
	}

	private void printArea() {
		double rectangle_area = getArea();
		System.out.println(rectangle_area);
	}

	private void printLength() {
		double rectangle_length = getLength();
		System.out.println(rectangle_length);
	}

	private int getArea() {
		return width * height;
	}

	private int getLength() {
		return 2 * (width + height);
	}
}
