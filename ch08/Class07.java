/*第7題
 * 
 */
class CTest{
	void test(int n){
		if (n%2==1){
			System.out.println(n +", 此數為奇數");
		}else if (n==0){
			System.out.println(n +", 此數為 0");		
		}else{
			System.out.println(n +", 此數為偶數");		
		}
	}
}  
public class Class07 {

	public static void main(String[] args) {
		CTest test1 =new CTest();
		test1.test(3);
		test1.test(8);
		test1.test(0);		
	}

}
