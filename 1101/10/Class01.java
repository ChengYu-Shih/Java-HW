class Cal_area
{
   int width;
   int height;
   int length;
   int radius;

   void setLocation(int x,int y,int z) {  
	   length=x;
	   width=y;
	   height=z;
	   
	}
   void setRadius(int r) {           
		radius=r;
	}

    void show() {
    	System.out.println("�b�|="+radius);
    	System.out.println("�D����n="+(4.0/3)*3.14*radius*radius*radius);
    	
    	System.out.println("��="+length);
    	System.out.println("�e="+width);
    	System.out.println("��="+height);
		System.out.println("�ߤ�����n="+(width*height*2+width*length*2+length*height*2));
    
    	
    }
   



}
public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Cal_area cal=new Cal_area();
		  cal.setLocation(4,5,6);
		  cal.setRadius(10);
		  cal.show();
		  
		  
			
		
		  
	 
	}

}
