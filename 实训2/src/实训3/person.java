package 实训3;

public class person {
	String name;
	public person(String name) {
		this.name=name;
	}
	public void doOn(On_Off o) {
		System.out.println(name+"正在进行操作：");
		o.off();
	}
	
	public void doOff(On_Off o) {
		System.out.println(name+"正在进行操作：");
		o.on();
	}
}
