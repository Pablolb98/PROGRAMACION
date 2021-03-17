package actExamenProgr;

public class City {

	private int id;
	private String name;
	private String countryCode;
	private String district;
	private String population;

	
	public City() {
		// TODO Auto-generated constructor stub
	}

	public City(int id, String name, String countryCode, String district, String population) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district= district;
		this.population=population;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the cif
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param cif the cif to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the nombre
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", countryCode=" + countryCode + ", district=" + district
				+ ", population=" + population + "]";
	}

	
}
