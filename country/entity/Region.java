package by.htp.country.entity;

import java.util.List;

public class Region {
	
	private List<District> districts;
	private String name;
	private City mainCity;
	
	public Region() {
		
	}
	
	public Region(List<District> districts, String name, City mainCity) {
		this.districts = districts;
		this.name = name;
		this.mainCity = mainCity;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getMainCity() {
		return mainCity;
	}

	public void setMainCity(City mainCity) {
		this.mainCity = mainCity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((mainCity == null) ? 0 : mainCity.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (mainCity == null) {
			if (other.mainCity != null)
				return false;
		} else if (!mainCity.equals(other.mainCity))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
