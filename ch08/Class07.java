/*��7�D
 * 
 */
class CTest{
	void test(int n) {
		if (n%2==1) {
			System.out.println(n +", ���Ƭ��_��");
		}else if (n==0) {
			System.out.println(n +", ���Ƭ� 0");		
		}else {
			System.out.println(n +", ���Ƭ�����");		
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
