interface Data {
	public void showData();
}

interface Test {
	public void showScore();

	public double score();
}

class CStu implements Data, Test {
	protected String id;                 // �Ǹ�
	protected String name;               // �m�W
	protected int mid;                   // �����Ҧ��Z
	protected int finl;                  // �����Ҧ��Z
	protected int common;                // ���ɦ��Z               

	public CStu(String a, String b, int m, int f, int c) {
		id = a;
		name = b;
		mid = m;
		finl = f;
		common = c;
	}

	public void show() {
		showData();
		showScore();
	}

	public void showScore() {

		System.out.println("�����Ҧ��Z:" + mid);
		System.out.println("�����Ҧ��Z:" + finl);
		System.out.println("���ɦ��Z:" + common);
		System.out.println("�Ǵ����Z:" + score());
	}
	public void showData() {
		System.out.println("�Ǹ�:"+id);
		System.out.println("�m�W:"+name);
	}
	public double score(){
		return (mid*0.3+finl*0.3+common*0.4);
	
	}
}

public class class11 {

	public static void main(String[] args) {
		CStu stu=new CStu("940001","Fiona",90,92,85);
		stu.show();

	}

}
