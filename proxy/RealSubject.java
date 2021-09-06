package pattern.proxy;

public class RealSubject implements Subject {

	@Override
	public void doAction() {
		System.out.println("RealSubject is doing some real work here!");
	}

}
