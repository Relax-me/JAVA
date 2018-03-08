package Set;

public class Class2 {
	int a;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
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
		Class2 other = (Class2) obj;
		if (a != other.a)
			return false;
		return true;
	}
}
