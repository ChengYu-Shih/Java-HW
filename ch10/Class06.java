class Ctrangle{
	protected int base;
	protected int height;
	public  Ctrangle(int b,int h) {
		base=b;
		height=h;
	}
	
	protected void show() {
		System.out.println("base="+base+", height="+height);
	}
}
class CData extends Ctrangle{
	public CData(int b,int h) {
		super(b,h);
	}
	public void area() {
		show();
		System.out.println("area="+base*height/2.0);
		
			
	}
		
			
}
public class Class06 {

	public static void main(String[] args) {
		CData d = new CData(3,8);
		d.area();

	}

}
