package studio7;

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public String sum(Fraction other) {
		int newNum = (this.numerator*other.denominator)+(other.numerator*this.denominator);
		int newDenom = (this.denominator*other.denominator);
		return (newNum+ "/"+newDenom);
	}
	
	public String product(Fraction other) {
		int newNum = (this.numerator*other.numerator);
		int newDenom = (this.denominator*other.denominator);
		return (newNum+ "/"+newDenom);
		}
	
	public String reciprocal() {
		return (this.denominator+ "/"+this.numerator); 
		}
	
	public String simplify() {
		int x = 1;
		for(int i =1; i<=this.numerator;i++){
			if (this.numerator % i ==0 && this.denominator % i ==0) {
				x = i;
			}
		}
			return ((this.numerator/x) + "/"+ (this.denominator/x));
			}		
		
	
	public static void main(String[] args) {
		Fraction fraction1 = new Fraction(3,9);
		Fraction fraction2 = new Fraction(5,3);

		System.out.println(fraction1.simplify());
		String x = fraction1.product(fraction2);
		System.out.println(x);
		Fraction fraction3 = new Fraction(15,27);
		System.out.println(fraction3.simplify());
		
		System.out.println(fraction1);
	}

}
