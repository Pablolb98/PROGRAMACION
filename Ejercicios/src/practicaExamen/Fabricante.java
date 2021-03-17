package practicaExamen;

public class Fabricante {

	private int ID;
	private String Name;
	private String CountryCode;
	
	public Fabricante() {
		// TODO Auto-generated constructor stub
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}

	@Override
	public String toString() {
		return "Fabricante [ID=" + ID + ", Name=" + Name + ", CountryCode=" + CountryCode + "]";
	}

	public Fabricante(int iD, String name, String countryCode) {
		super();
		ID = iD;
		Name = name;
		CountryCode = countryCode;
	}

	
}
