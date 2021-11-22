interface Math{
	public abstract void show();	
	public abstract void add (int a,int b);
	public abstract void sub (int a,int b);
	public abstract void mul (int a,int b);
	public abstract void div (int a,int b);
}
class Compute implements Math{
	public int ans;
	public void show() {		
		System.out.println("ans="+ans);
	}
	public void add(int a,int b) {
		ans=a+b;
	}
	public void sub(int a,int b) {
		ans=a-b;
	}
	public void mul(int a,int b) {
		ans=a*b;
	}
	public void div(int a,int b) {
		ans=a/b;
	}
}
public class class05 {

	public static void main(String[] args) {
		Compute com=new Compute();
		com.mul(3, 5);
		com.show();

	}

}
