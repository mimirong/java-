package ʵѵ2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder=new Cylinder(3.6, 6);
		cylinder.showMessage("Բ����");
		double cubage=cylinder.doCubage();
		System.out.println(",�������Ϊ��"+cubage);
		
		Cone cone=new Cone(4, 6.9);
		cone.showMessage("Բ׶��");
		cubage=cone.doCubage();
		System.out.println(",�����ἰΪ"+cubage);
	}

}
