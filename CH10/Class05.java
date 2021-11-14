/*²Ä5ÃD
 * 
 */
class Ca{
	private int num;
	public Ca(int n) {
		num=n;
	}
	public int get() {
		return num;		
	}
}
class Cb extends Ca{
	public Cb() {
		super(2);
	}
	public void show() {
		System.out.println("num="+get());
	}
}
public class Class05 {

	public static void main(String[] args) {
		Cb bb = new Cb();
		bb.show();
	}

}
