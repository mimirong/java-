package ʵѵ3;

public class lamp implements On_Off{
	int status=On_Off.OFF;
	
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		if(status==On_Off.OFF) {
			System.out.println("���ƣ�");
			status=On_Off.ON;
		}else
			System.out.println("�ƿ���״̬");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		if (status==On_Off.ON) {
			System.out.println("�صƣ�");
			status=On_Off.OFF;
		}else
			System.out.println("�ƹر�״̬");
			
		
	}

}
