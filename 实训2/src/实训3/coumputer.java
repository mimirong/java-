package ʵѵ3;

public class coumputer implements On_Off{
	int status=On_Off.OFF;
	String logo;
	public coumputer(String logo) {
		this.logo=logo;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		if(status==On_Off.OFF) {
			System.out.println("������");
			status=On_Off.ON;
		}else
			System.out.println("����״̬");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		if (status==On_Off.ON) {
			System.out.println("�ػ���");
			status=On_Off.OFF;
		}else
			System.out.println("�ػ�״̬");
	}

}
