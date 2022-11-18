package jana60.bank;

public class Main {
	public static void main(String[] args) {
		
		Conto c1 = new Conto("TestConto 1");
		c1.addMoney(50);
		System.out.println(c1);
		
		System.out.println("    ---------------  ");
		
		Conto c2 = new Conto("TestConto 2");
		c2.addMoney(50);
		c2.getMoney(100);
		System.out.println(c2);
		
		System.out.println("    ---------------  ");
		
		Conto c3 = new Conto("TestConto 3");
		c3.addMoney(300);
		c3.getMoney(20);
		System.out.println(c3);
		
		
		
	}
}