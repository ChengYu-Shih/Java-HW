/*²Ä7ÃD
 * 
 */
class Cmath{
	public static void math(int x,int n){
		int sum=1;
        for(int i=1;i<=n;i++)  
        sum*=x;  
        System.out.println(sum);  
    }  
}  
public class Class07 {

	public static void main(String[] args) {
		Cmath.math(2,5);  
		Cmath.math(3,2);
	}

}
