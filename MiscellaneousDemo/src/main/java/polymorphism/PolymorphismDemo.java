package polymorphism;

import java.util.HashMap;

public class PolymorphismDemo {

	public static void main(String args[]) {
		
		Parent parentObj = new Parent();
		Child childObj = new Child();
		Parent hybridObj = new Child();
		
		//Parent obj accesses only parent methods
		parentObj.method1();
		parentObj.method2();
		
		//Child obj accesses both parent & Child methods
		childObj.method1();
		childObj.method2();
		childObj.method3();
		
		//hybrid obj accesses only parent methods
		hybridObj.method1();
		hybridObj.method2();
		
	}
	
}
