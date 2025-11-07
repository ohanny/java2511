import java.util.Comparator;

public class FruitComparatorByNameAndId implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		int comp = o1.getName().compareTo(o2.getName());
		if (comp == 0) {
			comp = o1.getId() - o2.getId();
		}
		return comp;
	}

}
