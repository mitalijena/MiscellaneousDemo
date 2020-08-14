package cloning;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Employee implements Cloneable {
	
	int a;
	String b;
	
	private int eid;
	private String ename;
	
	/**
	 * @param eid
	 * @param ename
	 */
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

	/*
	 * public Object clone()throws CloneNotSupportedException{ return super.clone();
	 * }
	 */ 
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1 = new Employee(1, "Mitali");
		e1.a = 10;
		e1.b = "M1";
		Employee e2 = (Employee) e1.clone();//Deep copy
		Employee e3 = e1;//Shallow copy

		System.out.println("Employee e1 : "+e1.toString());
		System.out.println("Employee e2 : "+e2.toString());
		System.out.println("Employee e3 : "+e3.toString());
		System.out.println("Primitives : a : " + e1.a + " : b : " + e1.b);
		System.out.println("Primitives : a : " + e2.a + " : b : " + e2.b);
		System.out.println("Primitives : a : " + e3.a + " : b : " + e3.b);
		System.out.println("------------------------");
		
		e2.eid = 2;
		e2.a = 100;
		
		System.out.println("Employee e1 : "+e1.toString());//Changes wont be reflected as it was deep copy
		System.out.println("Employee e2 : "+e2.toString());
		System.out.println("Employee e3 : "+e3.toString());
		System.out.println("Primitives : a : " + e1.a + " : b : " + e1.b);
		System.out.println("Primitives : a : " + e2.a + " : b : " + e2.b);
		System.out.println("Primitives : a : " + e3.a + " : b : " + e3.b);
		System.out.println("------------------------");
		
		e3.ename = "Manoj";
		e3.b = "M3";
		
		System.out.println("Employee e1 : "+e1.toString());//Changes reflected as it was shallow copy
		System.out.println("Employee e2 : "+e2.toString());
		System.out.println("Employee e3 : "+e3.toString());
		System.out.println("Primitives : a : " + e1.a + " : b : " + e1.b);
		System.out.println("Primitives : a : " + e2.a + " : b : " + e2.b);
		System.out.println("Primitives : a : " + e3.a + " : b : " + e3.b);
	}

}
