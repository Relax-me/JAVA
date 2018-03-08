package OutIn;

public class Out {
	public void Show() {
		System.out.println("我是外部");
	}

	class In {
		public Object Show() {
			System.out.println("我是内部");
			class InMethod{
				public void Show(){
					System.out.println("我是内部类函数里面的类");
				}

				@Override
				public String toString() {
					Show();
					return "InMethod [toString()=" + super.toString() + "]";
				}
				
			}
			InMethod inMethod=new InMethod();
			return inMethod;
		}
	}
}
