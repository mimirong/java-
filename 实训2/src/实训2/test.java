package 实训2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder=new Cylinder(3.6, 6);
		cylinder.showMessage("圆柱体");
		double cubage=cylinder.doCubage();
		System.out.println(",他的体积为："+cubage);
		
		Cone cone=new Cone(4, 6.9);
		cone.showMessage("圆锥体");
		cubage=cone.doCubage();
		System.out.println(",他的提及为"+cubage);
	}

}
