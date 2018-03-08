package Set;

public class Class1 implements Comparable<Object>{
	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public Class1(String s) {
		super();
		this.s = s;
	}
	@Override
	public String toString() {
		return s;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
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
		Class1 other = (Class1) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		if(arg0 instanceof Class1) {
			return this.s.compareTo(((Class1) arg0).s);
		}else if(arg0 instanceof String) {
			return this.s.compareTo((String) arg0);
		}else return 0;
	}

	
}
