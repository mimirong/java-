package ʵѵ3;

public class person {
	String name;
	public person(String name) {
		this.name=name;
	}
	public void doOn(On_Off o) {
		System.out.println(name+"���ڽ��в�����");
		o.off();
	}
	
	public void doOff(On_Off o) {
		System.out.println(name+"���ڽ��в�����");
		o.on();
	}
}
