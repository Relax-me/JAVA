package Try;

public class ZhengException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num;
	public ZhengException(int num) {
		this.num=num;
	}
	public void printStackTrace() {
		System.err.print(toString());
		System.err.println(":����"+num+"��������");
	}
}
