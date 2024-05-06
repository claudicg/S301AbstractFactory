package n2exercici1.beans;

public abstract class Telephone {

	protected String telephone;
	
	
	public Telephone(String telephone) {
		super();
		this.telephone = telephone;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public abstract void printCountryTelephone();
	
}
