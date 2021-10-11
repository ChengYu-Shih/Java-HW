/*²Ä16ÃD
 * 
 */
class CSphere{
	private int x;
	private int y;
	private int z;
	private int radius;
	void setLocation(int a,int b,int c) {    //(a)
		x=a;
		y=b;
		z=c;
	}
	void setRadius(int r) {              //(b)
		radius=r;
	}
	double surfaceArea() {               //(c)
		return 4*3.14*radius*radius;
	} 
	double volume() {                    //(d)
		return (4.0/3)*3.14*radius*radius*radius;
	}
	void setCenter() {                   //(e)
		System.out.println("X="+ x+",Y="+ y+",Z="+ z);
	}		
}
public class Class16 {	

	public static void main(String[] args) {
		CSphere cs=new CSphere();
		cs.setLocation(3,4,5);
		cs.setRadius(1);
		System.out.println("surfaceArea="+cs.surfaceArea());
		System.out.println("volume="+cs.volume());
		cs.setCenter();
	}

}
