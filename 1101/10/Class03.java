class Data{
	private String name;
	private Test score;
	class Test{
		private int english;
		private int math;
		
		public Test(int eng,int m) {
			english=eng;
			math=m;
		}
		public double avg() {
			return(english+math)/2.0;
		}	
	}
	public Data(String n,int eng,int ma) {
		name=n;
		score=new Test(eng,ma);
	}
	public void show() {
		System.out.println("name:"+name); 
		System.out.println("english="+score.english);
		System.out.println("math="+score.math);
		System.out.println("avg="+score.avg());
		
	}
	
}
public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data da =new Data("Annie",85,92);
		da.show();
		Data ta =new Data("Brian",77,56);
		ta.show();
		int table[][]={{85,92},{77,56}};
		double s[]=new double[2];  
		double t[]=new double[2];  
		double high=table[0][0],low=table[0][0];  		
		System.out.println("  姓名  英文 數學");
		System.out.println("Annie  85  92");
		System.out.println("Brian  77  56");
	}

}

