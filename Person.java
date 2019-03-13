class Person {
	private String name;
	private String surname;

	public Person() { }

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Person(String name) {
		this(name, "");
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}
}

