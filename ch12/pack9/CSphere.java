package pack9;
package pack9.sub1; // �N CSphere ���O�ǤJ pack9.sub1 ��
public class CSphere {
	final static double PI = 3.14;
	private double radius;

	public CSphere(double r) {
		radius = r;
	}

	public void show() {
		double vol = 4 / 3.0 * PI * radius * radius * radius;

		System.out.print("radius=" + radius);
		System.out.println(", volume=" + vol);
	}

}
