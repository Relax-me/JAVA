package OutIn;

public class Out {
	public void Show() {
		System.out.println("�����ⲿ");
	}

	class In {
		public Object Show() {
			System.out.println("�����ڲ�");
			class InMethod{
				public void Show(){
					System.out.println("�����ڲ��ຯ���������");
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
