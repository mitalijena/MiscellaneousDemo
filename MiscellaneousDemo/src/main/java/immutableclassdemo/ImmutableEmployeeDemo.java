package immutableclass;

public class ImmutableEmployeeDemo {

	public static void main(String[] args) {
		
		EmployeeAddress addr = new EmployeeAddress();
	    addr.setPlotNo(1);
	    addr.setHouseName("Mits");
	    ImmutableEmployee employee = new ImmutableEmployee(1, "Alex", addr);

	    System.out.println("Employee before : "+employee.toString());
	    
	    addr.setHouseName("Mans");
	    
	    //employee.getEmployeeAdd().setHouseName("Mans");

	    System.out.println("Employee after : "+employee.toString());
	}

}
