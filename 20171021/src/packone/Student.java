package packone;

public class Student extends Object {
	int id;
	String name;
	char sex;
	{
		System.out.println("123");
	}
	static{
		System.out.println("456");
	}
	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	public static void main(String... args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		// TODO Auto-generated method stub
		Student student = new Student();
		System.out.println(student);
		System.out.println(student.getClass().getName() + "@" + Integer.toHexString(student.hashCode()));
		System.out.println(student.hashCode());
		String[] s = new String[2];
		// S("123","456");
		S(s);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sex;
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
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}

	public Student(int id, String name, char sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

	public static void S(String[] food) {
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}

	}
}
