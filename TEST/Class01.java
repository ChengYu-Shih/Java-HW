class Cal_area
{
   int width;
   int height;
   int length;
   int radius;

   void setLocation(int x,int y,int z) {    
	   width=x;
	   height=y;
	   length=z;
	}
   void setRadius(int r) {           
		radius=r;
	}
   double volume() {                   
		return (4.0/3)*3.14*radius*radius*radius;
	}
    int volume1() {                    
    	return width*height*2+width*length*2+length*height*2;
	
	}
   



}
public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Cal_area cal=new Cal_area();
		  cal.setLocation(4,5,6);
		  cal.setRadius(10);
		  
			
		  System.out.println("求形體積="+cal.volume());
		  System.out.println("立方體表面積="+cal.volume1());
		  
	 
	}

}
