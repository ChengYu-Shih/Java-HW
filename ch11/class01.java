
public class class01 {
	public CShape color;
	abstract CShape(String str) {
		color=str;
	}
	public abstract void show();
}

	public static void main(String[] args) {
		CRectangle rect1=new CRectangle(5,10);
		rect1.show();
		CCircle cir =new CCircle(2,0);
		cir.show();
		

	}

}
