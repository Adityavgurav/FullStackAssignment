package Assignment3;

public class areaAndPerimeter {
	void area(int l,int b) {
		int c;
		c=l*b;
		System.out.println("Area of rectangle:"+c);
	}
	void perimeter(int l,int b) {
		int c;
		c=2*l+2*b;
		System.out.println("perimeter of rectangle:"+c);
	}

public static void main(String args[])
{
	areaAndPerimeter obj=new areaAndPerimeter();
	obj.area(5,6);
	obj.perimeter(6,7);
}
}
