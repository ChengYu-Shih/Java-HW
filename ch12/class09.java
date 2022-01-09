/*第9題
 * 
 */
package pack9;      
import pack9.sub1.CSphere;//載入 pack9.sub1 裡的 CSphere 類別
import pack9.sub2.CTrapezoid;//載入pack9.sub2 裡的CTrapezoid類別
public class class09 {

	public static void main(String[] args) {
		CSphere sp=new CSphere(2);
		CTrapezoid tra=new CTrapezoid(2,3,4);
		sp.show();
		tra.show();

	}

}
