package singleton;

public class LazyStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//懒汉式单例类.在第一次调用的时候实例化
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
