package voitureapp.model;

import java.util.Objects;

public class Country {
	private String code;
	private String name;
	
	public Country(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		//if (Objects.isNull(obj)) return false;
		
		if (obj == null) return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(code, other.code) && Objects.equals(name, other.name);
		//return code != null && code.equals(other.code) && Objects.equals(name, other.name);
	}
	
	
}
