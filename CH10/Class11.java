/*²Ä11ÃD
 * 
 */
class CShape{
	public double area() {
		return 0.0;
	}
}
class CCircle extends CShape{
	double radius;
	public CCircle(double r) {
		radius=r;		
	}
	public double area() {
		return (3.14*radius*radius);
	}
	
}
class CSquare extends CShape{
	double side;
	public CSquare(double s) {
		side=s;		
	}
	public double area() {
		return (side*side);
	}
	
}
class CTriangle extends CShape{
	double base;
	double height;
	public CTriangle(double b,double h) {
		base=b;
		height=h;
	}
	public double area() {
		return (base*height/2.0);
	}
	
}
public class Class11 {

	public static void main(String[] args) {
		CCircle cir1=new CCircle(1.0);
		CCircle cir2=new CCircle(2.0);
		CSquare squ1=new CSquare(1.0);
		CSquare squ2=new CSquare(2.0);
		CTriangle tri1=new CTriangle(1,2);
		CTriangle tri2=new CTriangle(2,4);
		System.out.println("circle(1.0)="+cir1.area());
		System.out.println("circle(2.0)="+cir2.area());
		System.out.println("square(1.0)="+squ1.area());
		System.out.println("square(2.0)="+squ2.area());
		System.out.println("triangle(1,2)="+tri1.area());
		System.out.println("triangle(2,4)="+tri2.area());

	}

}
