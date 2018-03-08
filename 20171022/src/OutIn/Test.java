package OutIn;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Out out = new Out();
		out.Show();
		Out.In in = new Out().new In();
		in.Show();
		Object object=in.Show();
		object.toString();
	}

}
