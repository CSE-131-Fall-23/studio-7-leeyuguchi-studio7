package studio7;

public class Die {

	private int n;
	public Die(int n) {
		this.n = n;
	}
	
	public int random() {
		return (int) (Math.random()*(this.n-1+1)+1);
	}
	
	public static void main(String[] args) {
		Die die1 = new Die(8);
		System.out.println(die1.random());
	}

}
