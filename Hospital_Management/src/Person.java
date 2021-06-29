public class Person {

	private String name;
	private int age;
	private String job;
	private String gender;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	/**
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return this.job;
	}

	/**
	 * 
	 * @param job
	 */
	public void setJob(String job) {
		this.job = job;
	}

	public Person() {
		// TODO - implement Person.Person
		throw new UnsupportedOperationException();
	}

	public String getGender() {
		return this.gender;
	}

	/**
	 * 
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

}