package pattern.proxy;

public class Proxy implements Subject {
	private RealSubject subject;
	
	@Override
	public void doAction() {
		System.out.println("Calling the real subject to do the real work...");
		if (subject == null) {
			subject = new RealSubject();
		}
		subject.doAction();
	}

}
