package oberserve.test1;

public interface Subject {
	public void attach (Observer o);
	public void detach(Observer o);
	public void notice();
}
