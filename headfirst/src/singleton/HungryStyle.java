package singleton;

//����ʽ����.�����ʼ��ʱ���Ѿ�����ʵ����
public class HungryStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Singleton1 {
	private Singleton1 () {
		
	}
	
	private static final Singleton1 single = new Singleton1();
	
	public static Singleton1 getInstance () {
		return single;
	}
	
}
