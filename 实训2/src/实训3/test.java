package 实训3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person per=new person("张三");
		lamp lam=new lamp();
		coumputer comput=new coumputer("lenovos");
		per.doOn(lam);
		per.doOn(comput);
		per.doOff(lam);
		per.doOff(comput);
		
	}

}
