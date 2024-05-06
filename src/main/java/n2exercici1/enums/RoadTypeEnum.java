package n2exercici1.enums;

public enum RoadTypeEnum {

	STREET("Street", "Calle"),
	AVENUE("Avenue", "Avenida"),
	SQUARE("Square", "Plaza"),
	PASSAGE("Passage", "Pasage"),
	PROMENADE("Promenade", "Paseo");
	
	private String englishName;
	private String spanishName;
	
	private RoadTypeEnum(String englishName, String spanishName) {
		this.englishName = englishName;
		this.spanishName = spanishName;
	}
	
	
	public String getEnglishName() {
		return englishName;
	}
	public String getSpanishName() {
		return spanishName;
	}	
}
