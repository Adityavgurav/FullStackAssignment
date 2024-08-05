package assignment2;

public class areaCircumference {
	void area(int r) {
	double pi=3.14,area;
	area=pi*r*r;
	System.out.println("Area of circle is:"+area);

}
	void circumference(int r) {
		double pi=3.14,circumference;
		circumference=2*3.14*r;
		System.out.println("circumference of circle is:"+circumference);
		}

public static void main(String args[]) {
areaCircumference obj=new areaCircumference();
obj.area(4);
obj.circumference(6);
}
}

	
