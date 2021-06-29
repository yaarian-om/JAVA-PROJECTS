public class Staff extends Person {

	private String staffSalary;
	private String staffShift;

	/**
	 * 
	 * @param staffSalary
	 */
	public void setStaffSalary(String staffSalary) {
		this.staffSalary = staffSalary;
	}

	public String getStaffSalary() {
		return this.staffSalary;
	}

	public String getStaffShift() {
		return this.staffShift;
	}

	/**
	 * 
	 * @param staffShift
	 */
	public void setStaffShift(String staffShift) {
		this.staffShift = staffShift;
	}

}