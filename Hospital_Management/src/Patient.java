public class Patient extends Person {

	private String disease;
	private double totalCost;

	public String getDisease() {
		return this.disease;
	}

	/**
	 * 
	 * @param disease
	 */
	public void setDisease(String disease) {
		this.disease = disease;
	}

	public double totalCost() {
		// TODO - implement Patient.totalCost
		throw new UnsupportedOperationException();
	}

}