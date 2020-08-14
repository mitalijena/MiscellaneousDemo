package immutableclass;

public final class ImmutableEmployee {
	
	private final int employeeId;
	private final String employeeName;
	private final EmployeeAddress employeeAdd;
	
	public ImmutableEmployee(int employeeId, String employeeName, EmployeeAddress employeeAdd) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		EmployeeAddress addr = new EmployeeAddress();
		addr.setPlotNo(employeeAdd.getPlotNo());
		addr.setHouseName(employeeAdd.getHouseName());
		this.employeeAdd = addr;
	}
	
	public EmployeeAddress getEmployeeAdd() {
		EmployeeAddress addr = new EmployeeAddress();
		addr.setPlotNo(this.employeeAdd.getPlotNo());
		addr.setHouseName(this.employeeAdd.getHouseName());
		return addr;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	@Override
	public String toString() {
		return "ImmutableEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAdd="
				+ employeeAdd + "]";
	}

}
