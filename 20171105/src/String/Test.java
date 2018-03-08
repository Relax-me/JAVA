package String;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cs="slh19970228".toCharArray();
		char[] cs2=new char[cs.length];
		for (int i=0;i<cs.length;i++) {
			cs2[cs.length-1-i]=cs[i];
		}
		System.out.println(cs);
		System.out.println(cs2);
		System.out.println("123".compareTo("456"));
		StringBuffer stringBuffer=new StringBuffer("1234");
		System.out.println(stringBuffer.capacity());
		System.out.println(stringBuffer.append("123"));
		System.out.println(isSame("12321")?"是对称的":"不是对称的");
	}
	static boolean isSame(String s) {
		char[] cs=s.toCharArray();
		char[] cs2=new char[cs.length/2];
		for (int i=cs.length-1;i>=((cs.length%2==0)?cs.length/2:cs.length/2+1);i--) {
			cs2[cs.length-1-i]=cs[i];
		}
		String s2=new String(cs2);
		for (int i=0;i<cs.length/2;i++) {
			cs2[i]=cs[i];
		}
		cs2.equals(cs);
		String s1=new String(cs2);
		if(s1.equals(s2))
			return true;
		return false;
	}
}
