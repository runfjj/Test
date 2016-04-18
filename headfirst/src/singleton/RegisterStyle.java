package singleton;

import java.util.HashMap;
import java.util.Map;

public class RegisterStyle {

	public static void main(String[] args) {
		Singleton3 single = Singleton3.getInstance(null);
		System.out.println(single.about());

	}

}

//登记式单例类
//类似Spring里面的方法，将类名注册，下次从里面直接获取
class Singleton3 {
	
	private static Map<String, Singleton3> map = new HashMap<String, Singleton3>();
	
	static{
		Singleton3 single =new Singleton3();
		map.put(single.getClass().getName(), single);	
	}
	
	//保护的默认构造函数
	protected Singleton3 () { }
	
    public static Singleton3 getInstance(String name) {
        if(name == null) {
            name = Singleton3.class.getName();
            System.out.println("name == null"+"--->name="+name);
        }
        if(map.get(name) == null) {
            try {
                map.put(name, (Singleton3) Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }
	
	public String about () {
			return "Hello, I am RegSingleton.";
		}
	}
	
