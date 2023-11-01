package studio7;

public class Complex {

	private double real;
	private double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public String add(Complex other) {
		double newReal = this.real + other.real;
		double newImaginary = this.imaginary + other.imaginary;
		return (newReal + " + "+newImaginary+"i");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
