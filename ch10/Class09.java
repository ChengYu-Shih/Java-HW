class Caaa1{
	private int num;
    public void display() {
    	System.out.println("printed from Caaa class");
    	
    }
	
}
class Cbbb1 extends Caaa1{
	
	public void display() {
    	System.out.println("printed from Cbbb class");
	}
}
public class Class09 {

	public static void main(String[] args) {
		Caaa1 a= new Caaa1();
		Caaa1 b = new Cbbb1();
		a.display();                //a
		b.display();                //b
	}

}