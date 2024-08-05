package Assignment_1;

public class Arithmetic {
	void Add(int a,int b) {
		int s=a+b;
		System.out.println("Addition is:"+s);
	}
	void Sub(int a,int b) {
		int s=a-b;
		System.out.println("Substraction is :"+s);
	}
	void Mul(int a,int b) {
		int s=a*b;
		System.out.println("Multiplication is:"+s);
	}
	void Div(int a,int b) {
		int s=a/b;
		System.out.println("Division is is:"+s);
	}
	void Mod(int a,int b) {
		int s=a%b;
		System.out.println("Modulo is:"+s);

}
	public static void main(String args[]) {
		Arithmetic obj=new Arithmetic();
		obj.Add(5, 7);
		obj.Sub(5, 7);
		obj.Mul(5, 7);
		obj.Div(5, 7);
		obj.Mod(5, 7);
	}
}

	