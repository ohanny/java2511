import java.util.Objects;

public class Fruit implements Comparable<Fruit> {
	private int id;
	private String name;
	
	public Fruit(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Fruit f) {
		//return name.compareTo(f.name);
		return this.id - f.id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	/*
	@Override
	public boolean equals(Object obj) {
		Fruit f = (Fruit)obj;
		return this.id == f.id && name != null 
				&& this.name.equals(f.name);
	}
	
	@Override
	public int hashCode() {
		//return id + 17 * name.hashCode();
		return Objects.hash(id, name);
	}
	*/
}
