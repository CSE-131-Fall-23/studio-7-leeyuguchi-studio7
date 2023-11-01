package studio7;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;	
	}

	public double area(){
		return this.length * this.width;
	}

	public double perimeter(){
		return 2*(this.length + this.width);
	}

	public boolean Square(){
		if (this.length==this.width) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isSmaller(Rectangle other){
		if (other.area()>this.area()) {
			return true;
		}
		else {
			return false;
		}
	}


	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(2.0,3.0);
		Rectangle rectangle2 = new Rectangle(5.0,4.0);
		System.out.println(rectangle1.isSmaller(rectangle2));
	}


}
