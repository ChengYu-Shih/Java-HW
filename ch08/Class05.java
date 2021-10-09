/*第5題
 * 
 */
class CBox1      //CBox跟第4題重疊到改CBox1
{
	int length;
	int width;
	int height;
	int volume() {                //(b)
	    return length*width*height;
	}
	int surfaceArea() {          //(c)   
		return 6*(length*width);
	}
	void showData() {              //(d)
		System.out.println("length="+length);
		System.out.println("width="+width);
		System.out.println("height="+height);
		
	} 
	void showAll() {                //(e)
		System.out.println("length="+length);
		System.out.println("width="+width);
		System.out.println("height="+height);
		System.out.println("volume="+volume());
		System.out.println("surfaceArea="+surfaceArea());		
	}
 }

public class Class05 {

	public static void main(String args[]) {
		CBox1 box;
		box=new CBox1();
		
		box.length=1;            //(a)
		box.width=1;             //(a)
		box.height=1;            //(a)
		
		System.out.println("volume="+box.volume());   //(b) 
		System.out.println("surfaceArea="+box.surfaceArea());  //(c) 
	
	

	}

}
