package pack9;
package pack9.sub2; // 將 CTrapezoid 類別納入 pack9.sub2 中
public class CTrapezoid {
	private int upper;
	private int base;
	private int height;

	public CTrapezoid(int u, int b, int h) {
		upper = u;
		base = b;
		height = h;
	}

	public void show() {
		double area = (upper + base) * height / 2.0;
		System.out.print("upper=" + upper);
		System.out.print(", base=" + base);
		System.out.print(", height=" + height);
		System.out.println(", area=" + area);
	}

}
