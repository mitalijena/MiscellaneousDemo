package variablesdemo;

public class VariableDemo {
	
	int i; //instance variable : shared by all the Objects of the class
	static int j; //Static variable : Class level variable shared by all the Objects of the class
	final int k; //final variable
	static final int l; //static final variable

	public VariableDemo() {
		this.k = 5;		
	}
	
	static {
		l = 100;
	}
	
	public static void main(String args[]) {
		
		VariableDemo demo = new VariableDemo();
		demo.i = 101;
		System.out.println(demo.i);
		demo.main1();
		demo.main2();
		System.out.println("main() : Static variable : j : "+j);
	}
	
	public void main1() {
		int m;
		System.out.println("main1() : Instance variable : i :"+i);
		i = 10;
		System.out.println("main1() : Instance variable : i :"+i);
		System.out.println("main1() : Static variable : j : "+j);
		j = 30;
		System.out.println("main1() : Static variable : j : "+j);
		System.out.println("main1() : Final variable : k : "+k);
		System.out.println("main1() : Static Final variable : l : "+l);
		m = 50;
		System.out.println("main1() : local variable : m :"+m);
		
	}
	
	public void main2() {
		final int n;
		System.out.println("main2() : Instance variable : i :"+i);
		i = 20;
		System.out.println("main2() : Instance variable : i :"+i);
		System.out.println("main2() : Static variable : j : "+j);
		j = 40;
		System.out.println("main2() : Static variable : j : "+j);
		System.out.println("main2() : Final variable : k : "+k);
		System.out.println("main2() : Static Finnal variable : l : "+l);
		n = 90;
		System.out.println("main2() : Local Final variable : n :"+n);
		
	}
	
}
