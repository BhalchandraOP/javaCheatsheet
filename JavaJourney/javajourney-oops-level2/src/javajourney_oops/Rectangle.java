package javajourney_oops;

public class Rectangle {
	// state
	private int length;
	private int width;

	// creation
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	// operation

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return length * width;

	}

	public int perimeter() {
		return 2 * (length + width);
	}

	@Override
	public String toString() {
		return String.format("length - %d, width - %d , perimeter - %d , area - %d", length, width, perimeter(),
				area());

	}

}
