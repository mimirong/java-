package ÊµÑµ3;

public class lamp implements On_Off{
	int status=On_Off.OFF;
	
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		if(status==On_Off.OFF) {
			System.out.println("¿ªµÆ£¡");
			status=On_Off.ON;
		}else
			System.out.println("µÆ¿ªÆô×´Ì¬");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		if (status==On_Off.ON) {
			System.out.println("¹ØµÆ£¡");
			status=On_Off.OFF;
		}else
			System.out.println("µÆ¹Ø±Õ×´Ì¬");
			
		
	}

}
