package singleton;

public class LazyStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//����ʽ������.�ڵ�һ�ε��õ�ʱ��ʵ����
class Singleton2 {
	
	private Singleton2 () {
		
	}
	
	private static Singleton2 single = null;
	
	public static Singleton2 getInstance () {
		if (single==null) {
			single = new Singleton2();
		}
		return single;
	}
	
	
}
