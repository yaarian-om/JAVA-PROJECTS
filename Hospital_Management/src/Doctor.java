public class Doctor extends Person {

	private String docSalary;
	private String docSpecialist;
	private int docRoom;
	private String docShift;

	public String getDocSalary() {
		return this.docSalary;
	}

	/**
	 * 
	 * @param docSalary
	 */
	public void setDocSalary(String docSalary) {
		this.docSalary = docSalary;
	}

	public String getDocSpecialist() {
		return this.docSpecialist;
	}

	/**
	 * 
	 * @param docSpecialist
	 */
	public void setDocSpecialist(String docSpecialist) {
		this.docSpecialist = docSpecialist;
	}

	public int getDocRoom() {
		return this.docRoom;
	}

	/**
	 * 
	 * @param docRoom
	 */
	public void setDocRoom(int docRoom) {
		this.docRoom = docRoom;
	}

	public String getDocShift() {
		return this.docShift;
	}

	/**
	 * 
	 * @param docShift
	 */
	public void setDocShift(String docShift) {
		this.docShift = docShift;
	}

}