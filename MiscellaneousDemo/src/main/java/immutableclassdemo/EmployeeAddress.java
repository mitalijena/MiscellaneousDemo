package immutableclass;

public class EmployeeAddress {
	
	private int plotNo;
	private String houseName;
	
	public int getPlotNo() {
		return plotNo;
	}
	
	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}
	
	public String getHouseName() {
		return houseName;
	}
	
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	
	@Override
	public String toString() {
		return "EmployeeAddress [plotNo=" + plotNo + ", houseName=" + houseName + "]";
	}

}
