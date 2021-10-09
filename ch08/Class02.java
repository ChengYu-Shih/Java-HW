
/*第2題
 * 
 */
class Cbbb{
	double x;
	double y;
	}
public class Class02 {
	
	public static void main(String[] args){
		Cbbb obj1=new Cbbb();                //(a)
		Cbbb obj2=new Cbbb();
		Cbbb avg=new Cbbb();
		obj1.x=5.2; obj1.y=3.9;              //(b)
		obj2.x=6.5; obj2.y=4.6;              //(c)            
		avg.x =(obj1.x+obj2.x)/2;            //(d)          
		avg.y =(obj1.y+obj2.y)/2;            //(e)
		System.out.println("obj1.x="+obj1.x+" ,obj1.y="+obj1.y);     //(f)
		System.out.println("obj2.x="+obj2.x+" ,obj2.y="+obj2.y);
		System.out.println("avg.x="+avg.x+" ,avg.y="+avg.y);

	

	}
}
