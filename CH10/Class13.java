/*²Ä13ÃD
 * 
 */
class Caa{
	public int num1;
	public int num2;
	public Caa() {
		num1=1;
		num2=1;
    }
	public Caa(int a,int b) {
		num1=a;
		num2=b;	
	}	
}
class Cbb extends Caa{
	public Cbb() {
		super();
		
	}

	public void show() {
		System.out.println("num1="+num1+", num2="+num2);
	}
	
}
public class Class13 {

	public static void main(String[] args) {
		Cbb b1=new Cbb();			
		b1.show();
	

	}
}