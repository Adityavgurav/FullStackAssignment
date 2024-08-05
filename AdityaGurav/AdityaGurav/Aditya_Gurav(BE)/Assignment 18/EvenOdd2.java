package third;

public class EvenOdd2 extends EvenOdd {
    public EvenOdd2(int array[]) {
		super(array);
	}

	public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        EvenOdd obj = new EvenOdd(arr);
        obj.checkEvenOdd();

        int sumOfOddNumbers = obj.sumOddNumbers();
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
    }


}
