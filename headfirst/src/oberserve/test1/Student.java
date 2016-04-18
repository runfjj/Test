package oberserve.test1;

public class Student implements Observer {
	private String name;
	private String phone;
	private Teacher teacher;
	Student(String name, String phone, Teacher teacher) {
		this.name = name;
		this.phone = phone;
		this.teacher = teacher;
	}
	public void update() {
		
	}
	
	public String toString () {
		return "Name:"+this.name+" "+"Teacher"+this.teacher;
	}
}
