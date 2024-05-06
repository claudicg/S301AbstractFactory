package n2exercici1.enums;

public enum TypeEnum {

	HOME("Home"),
	MOBILE("Mobile"),
	JOB("Job"),
	BUSINESS("Business");
	
	private String name;

	private TypeEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
